package oop.inheritance.challenge;

public class Ferrari extends Car implements SportsCar, HasAC{
    public Ferrari() {
        super(15, 300);
    }
    private boolean isTurboOn = false;
    private boolean isACOn = false;

    @Override
    public void turnOffTurbo() {
        if (isTurboOn) {
            isTurboOn = false;
            setAcceleration(getAcceleration() / 2);
        }
    }

    @Override
    public void turnOnTurbo() {
        if (!isTurboOn) {
            isTurboOn = true;
            setAcceleration(getAcceleration() * 2);
        }
    }

    @Override
    public void turnOnAC() {
        if (!isACOn) isACOn = true;
    }

    @Override
    public void turnOffAC() {
        if (isACOn) isACOn = false;
    }
}
