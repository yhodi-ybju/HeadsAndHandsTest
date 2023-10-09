package ru.victor.Interfaces;

import ru.victor.Entities.Creature;
import ru.victor.Entities.Hero;

public interface CreatureServiceInterface {
    public boolean checkAttack(Creature creature, Creature newCreature);
    public void damage(Creature creature, Creature newCreature) throws Exception;
}
