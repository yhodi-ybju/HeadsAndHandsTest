package ru.victor.Exceptions;

public class HeroException extends Exception {
    private HeroException(String message) {
        super(message);
    }

    public static HeroException TooManyHealTimes() {
        return new HeroException("Too many heal times");
    }
}

