package exceptions.customA;

public class EmptyStringException extends RuntimeException{
    String attributeName;

    public EmptyStringException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("Attribute '%s' is empty", attributeName);
    }
}
