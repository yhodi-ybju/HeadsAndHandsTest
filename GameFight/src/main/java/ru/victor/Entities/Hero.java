package ru.victor.Entities;

import ru.victor.Exceptions.HeroException;
import ru.victor.Models.Damage;

public class Hero extends Creature {
    public int healTimes = 0;
    public Hero(double attack, double defense, double health, Damage damage) throws Exception {
        super(attack, defense, health, damage);
    }

    public void heal() throws Exception {
        if (this.healTimes > 4) {
            throw HeroException.TooManyHealTimes();
        }
        else {
            this.health += this.maxHealth * 0.3;
            this.healTimes += 1;
        }
    }

    public void healMultipleTimes(int times) throws Exception {
        if (this.healTimes > 4) {
            throw HeroException.TooManyHealTimes();
        }
        if (times > 4) {
            throw HeroException.TooManyHealTimes();
        }
        for (int i = 0; i < times; i++) {
            this.heal();
        }
    }
}
