package ru.victor.Services;

import ru.victor.Entities.Creature;
import ru.victor.Entities.Hero;
import ru.victor.Exceptions.CreatureException;
import ru.victor.Interfaces.CreatureServiceInterface;

public class CreatureService implements CreatureServiceInterface {

    @Override
    public boolean checkAttack(Creature creature, Creature newCreature) {
        double attackModifier = creature.attack - newCreature.defense + 1;
        boolean isSuccessful = false;
        for (int i = 0; i < (int)attackModifier; i++) {
            int number = (int) (Math.random() * 6);
            if (number > 4) {
                isSuccessful = true;
            }
        }
        return isSuccessful;
    }
    @Override
    public void damage(Creature creature, Creature newCreature) throws Exception {
        if (newCreature.isAlive) {
            if (newCreature.health < 0) {
                newCreature.isAlive = false;
                return;
            }
            if (checkAttack(creature, newCreature)) {
                newCreature.health -= creature.damage.calculateDamage();
            }
        }
        else {
            throw CreatureException.IsAlreadyDead();
        }
    }
}
