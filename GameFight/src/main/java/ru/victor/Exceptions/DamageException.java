package ru.victor.Exceptions;

public class DamageException extends Exception {
    private DamageException(String message) {
        super(message);
    }

    public static DamageException InvalidDamage() {
        return new DamageException("Invalid damage");
    }
}
