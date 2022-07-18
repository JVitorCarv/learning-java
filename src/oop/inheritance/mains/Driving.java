package oop.inheritance.mains;

import oop.inheritance.challenge.Civic;
import oop.inheritance.challenge.Ferrari;

public class Driving {
    public static void main(String[] args) {
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        for (int i = 0; i < 41; i++) {
            civic.accelerate();
        }
        System.out.println(civic.getSpeed());

        for (int i = 0; i < 21; i++) {
            ferrari.accelerate();
        }
        System.out.println(ferrari.getSpeed());

        for (int i = 0; i < 41; i++) {
            civic.brake();
        }
        System.out.println(civic.getSpeed());

        for (int i = 0; i < 21; i++) {
            ferrari.brake();
        }
        System.out.println(ferrari.getSpeed());
    }


}
