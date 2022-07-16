package oop.composition;

public class Motor {
    boolean isOn = false;
    double injectionFactor = 1;

    int spins() {
        if (!isOn) {
            return 0;
        }
        return (int) Math.round(injectionFactor *  3000);
    }
}
