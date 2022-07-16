package oop.composition;

public class Drive {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.isOn());

        car.turnOn();
        System.out.println(car.isOn());

        System.out.println(car.motor.spins());

        for (int i = 0; i < 4; i++) {
            car.accelerate();
        }
        System.out.println(car.motor.spins());

        for (int i = 0; i < 5; i++) {
            car.brake();
        }
        System.out.println(car.motor.spins());
    }
}
