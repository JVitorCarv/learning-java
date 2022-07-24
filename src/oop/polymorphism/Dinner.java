package oop.polymorphism;

public class Dinner {
    public static void main(String[] args) {
        Person person = new Person(99.65);
        Rice f1 = new Rice(0.2);
        Bean f2 = new Bean(0.1);
        IceCream f3 = new IceCream(0.1);

        System.out.println(person.getWeight());

        person.eat(f1);
        person.eat(f2);
        person.eat(f3);
        System.out.println(person.getWeight());
    }
}
