package oop.composition.bidirectional.oneToOne;

public class Car {
    // Of course this does not make sense...
    Motor motor;

    Car() {
        this.motor = new Motor(this);
    }

    void accelerate() {
        if (motor.injectionFactor < 2.6) {
            motor.injectionFactor += 0.4;
        }
    }

    void brake() {
        if (motor.injectionFactor > 0.5) {
            motor.injectionFactor -= 0.4;
        }
    }

    void turnOff() {
        motor.isOn = false;
    }

    void turnOn() {
        motor.isOn = true;
    }

    boolean isOn() {
        return motor.isOn;
    }
}
