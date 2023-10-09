package ru.victor.Models;
import ru.victor.Exceptions.DamageException;

import java.util.Random;

public class Damage {
    public double start;
    public double end;
    public Damage(double start, double end) throws DamageException {
        if (start > end) {
            throw DamageException.InvalidDamage();
        }
        this.start = start;
        this.end = end;
    }
    public double calculateDamage() {
        Random random = new Random();
        return random.nextInt((int) (this.end - this.start + 1)) + this.start;
    }
}
