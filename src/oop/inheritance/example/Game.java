package oop.inheritance.example;

public class Game {
    public static void main(String[] args) {
        Monster monster = new Monster(10, 10);

        Hero hero = new Hero(10, 11);

        monster.walk(Direction.NORTH);
        monster.walk(Direction.EAST);
        monster.walk(Direction.NORTH);
        monster.walk(Direction.EAST);

        System.out.println(monster.x + " " + monster.y);

        monster.walk(Direction.SOUTH);
        monster.walk(Direction.WEST);
        monster.walk(Direction.SOUTH);
        monster.walk(Direction.WEST);

        monster.attack(hero);
        hero.attack(monster);
        System.out.println("Monster: " + monster.hp);
        System.out.println("Hero: " + hero.hp);
    }
}
