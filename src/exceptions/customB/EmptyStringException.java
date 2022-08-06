package exceptions.customB;

public class EmptyStringException extends Exception{
    String attributeName;

    public EmptyStringException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("Attribute '%s' is empty", attributeName);
    }
}
