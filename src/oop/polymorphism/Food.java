package oop.polymorphism;

public abstract class Food {
    private double weight;

    public Food(double weight) {
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
