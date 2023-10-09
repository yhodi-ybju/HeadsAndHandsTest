import org.junit.jupiter.api.Test;
import ru.victor.Entities.Monster;
import ru.victor.Exceptions.HeroException;
import ru.victor.Models.Damage;
import ru.victor.Entities.Hero;
import ru.victor.Services.CreatureService;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GameFightTests {
    CreatureService service = new CreatureService();
    @Test
    public void healHero() throws Exception {
        Hero hero = new Hero(10, 2, 10, new Damage(1, 5));
        hero.heal();
        assertEquals(hero.health, 13);
    }

    @Test
    public void healTooMuch() throws Exception {
        Hero hero = new Hero(10, 2, 10, new Damage(1, 5));
        Assertions.assertThrows(HeroException.class, () -> hero.healMultipleTimes(5));
    }


    @Test
    public void die() throws Exception {
        Hero hero = new Hero(10, 2, 2, new Damage(1, 5));
        Monster monster = new Monster(29, 29, 100, new Damage(1, 5));
        CreatureService service = new CreatureService();
        while (hero.health > 0) {
            service.damage(monster, hero);
        }
        assertFalse(!hero.isAlive);
    }
}