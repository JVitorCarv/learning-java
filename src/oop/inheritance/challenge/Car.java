package oop.inheritance.challenge;

public class Car {
    int speed;
    int brakeAcceleration;
    int acceleration;
    final int MAX_SPEED;

    Car() {
        this(5, 200);
    }

    Car(int acceleration, int maxSpeed) {
        this.speed = 0;
        this.brakeAcceleration = 5;
        this.acceleration = acceleration;
        this.MAX_SPEED = maxSpeed;
    }

    void accelerate() {
        if (speed <=  - acceleration) { this.speed += acceleration; }
        else {this.speed = MAX_SPEED;}
    }

    void brake() {
        if (speed >= brakeAcceleration){ this.speed -= brakeAcceleration; }
        else { this.speed = 0; }
    }
}
