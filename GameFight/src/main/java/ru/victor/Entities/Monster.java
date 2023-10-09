package ru.victor.Entities;


import ru.victor.Models.Damage;

public class Monster extends Creature {
    public Monster(double attack, double defense, double health, Damage damage) throws Exception {
        super(attack, defense, health, damage);
    }
}