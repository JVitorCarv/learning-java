package oop.composition;

public class Car {
    //Making this bidirectional
    Motor motor = new Motor();

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
