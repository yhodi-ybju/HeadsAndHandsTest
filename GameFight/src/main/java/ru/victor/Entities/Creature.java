package ru.victor.Entities;


import ru.victor.Exceptions.CreatureException;
import ru.victor.Models.Damage;

public abstract class Creature {
    private final static int DEFENSE_MIN_VALUE = 1;

    private final static int DEFENSE_MAX_VALUE = 30;

    private final static int ATTACK_MIN_VALUE = 1;

    private final static int ATTACK_MAX_VALUE = 30;

    private final static int HEALTH_MIN_VALUE = 0;

    public double attack;
    public double defense;
    public double health;
    public Damage damage;
    public boolean isAlive;
    public double maxHealth;
    public Creature(double attack, double defense, double health, Damage damage) throws Exception {
        if (attack < ATTACK_MIN_VALUE || attack > ATTACK_MAX_VALUE) {
            throw CreatureException.InvalidCreatureAttack();
        }

        if (defense < DEFENSE_MIN_VALUE || defense > DEFENSE_MAX_VALUE) {
            throw CreatureException.InvalidCreatureDefense();
        }

        if (health < HEALTH_MIN_VALUE) {
            throw CreatureException.InvalidCreatureHealth();
        }

        if (damage == null) {
            throw CreatureException.InvalidCreatureDamage();
        }
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.damage = damage;
        this.maxHealth = health;
        isAlive = true;
    }
}
