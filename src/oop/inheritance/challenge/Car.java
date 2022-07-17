package oop.inheritance.challenge;

public class Car {
    int speed;
    int brakeAcceleration;
    int acceleration;
    final int maxSpeed;

    Car() {
        this(5, 200);
    }

    Car(int acceleration, int maxSpeed) {
        this.speed = 0;
        this.brakeAcceleration = 5;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
    }

    void accelerate() {
        if (speed <= maxSpeed - acceleration) { this.speed += acceleration; }
        else {this.speed = maxSpeed;}
    }

    void brake() {
        if (speed >= brakeAcceleration){ this.speed -= brakeAcceleration; }
        else { this.speed = 0; }
    }
}
