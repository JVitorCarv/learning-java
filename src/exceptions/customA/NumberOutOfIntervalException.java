package exceptions.customA;

public class NumberOutOfIntervalException extends RuntimeException {
    String attributeName;

    public NumberOutOfIntervalException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("Attribute '%s' is out of interval", attributeName);
    }
}

