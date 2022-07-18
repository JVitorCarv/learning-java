package oop.inheritance.challenge;

public interface HasAC {
    void turnOnAC();
    void turnOffAC();

    default int getACVelocity() {
        return 1;
    }
}
