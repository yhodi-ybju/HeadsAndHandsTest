package ru.victor.Exceptions;

public class CreatureException extends Exception {
    private CreatureException(String message) { super(message); }

    public static CreatureException InvalidCreatureAttack() {
        return new CreatureException("Invalid creature attack");
    }

    public static CreatureException InvalidCreatureDefense() {
        return new CreatureException("Invalid creature defense");
    }

    public static CreatureException InvalidCreatureHealth() {
        return new CreatureException("Invalid creature health");
    }

    public static CreatureException InvalidCreatureDamage() {
        return new CreatureException("Invalid creature damage");
    }
    public static CreatureException IsAlreadyDead() {
        return new CreatureException("This creature is alreade dead");
    }
}