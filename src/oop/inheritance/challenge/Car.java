package oop.inheritance.challenge;

public class Car {


    private int speed;
    protected int brakeAcceleration;
    private int acceleration;
    private final int MAX_SPEED;

    Car() {
        this(5, 200);
    }

    Car(int acceleration, int maxSpeed) {
        this.speed = 0;
        this.brakeAcceleration = 5;
        this.acceleration = acceleration;
        this.MAX_SPEED = maxSpeed;
    }
    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        if (speed <=  MAX_SPEED - acceleration) { this.speed += acceleration; }
        else {this.speed = MAX_SPEED;}
    }

    public void brake() {
        if (speed >= brakeAcceleration){ this.speed -= brakeAcceleration; }
        else { this.speed = 0; }
    }
}
