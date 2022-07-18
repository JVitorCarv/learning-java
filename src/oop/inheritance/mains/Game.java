package oop.inheritance.mains;

import oop.inheritance.example.Direction;
import oop.inheritance.example.Hero;
import oop.inheritance.example.Monster;

public class Game {
    public static void main(String[] args) {
        Monster monster = new Monster(10, 10);

        Hero hero = new Hero(10, 11);

        monster.walk(Direction.NORTH);
        monster.walk(Direction.EAST);
        monster.walk(Direction.NORTH);
        monster.walk(Direction.EAST);

        System.out.println(monster.getX() + " " + monster.getY());

        monster.walk(Direction.SOUTH);
        monster.walk(Direction.WEST);
        monster.walk(Direction.SOUTH);
        monster.walk(Direction.WEST);

        monster.attack(hero);
        hero.attack(monster);
        System.out.println("Monster: " + monster.getHp());
        System.out.println("Hero: " + hero.getHp());
    }
}
