package ru.victor;

import ru.victor.Models.Damage;
import ru.victor.Entities.Hero;
import ru.victor.Entities.Monster;
import ru.victor.Services.CreatureService;

public class Main {
    public static void main(String[] args) throws Exception {
        Monster monster = new Monster(10, 2, 100, new Damage(1, 5));
        Hero hero = new Hero(10, 2, 10, new Damage(1, 5));
        CreatureService service = new CreatureService();
        service.damage(hero, monster);
        System.out.print(monster.health);
    }
}
