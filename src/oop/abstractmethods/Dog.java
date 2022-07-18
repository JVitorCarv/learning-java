package oop.abstractmethods;

public abstract class Dog extends Animal {
    @Override
    public final void animalSound() {
        System.out.println("Woof");
    }

    public abstract void eatFavoriteFood();
}
