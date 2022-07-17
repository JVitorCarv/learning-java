package oop.inheritance.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    Car testCar = new Car();

    @Test
    public void speedMustNotBeNegativeAfterBrake() {
        testCar.brake();
        Assertions.assertEquals(0, testCar.speed);
    }

    @Test
    public void speedMustNotBeAboveMaxSpeed() {
        for (int i = 0; i < 41; i++) {
            testCar.accelerate();
        }
        Assertions.assertEquals(200, testCar.speed);
    }
}
