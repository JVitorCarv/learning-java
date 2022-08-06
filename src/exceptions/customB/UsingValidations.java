package exceptions.customB;

import exceptions.Student;

public class UsingValidations {
    public static void main(String[] args) {
        try {
            Student student = new Student("Name", 7);
            Validate.student(student);
            Validate.student(null);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (NumberOutOfIntervalException | IllegalArgumentException e) {
            // Notice that all this block can be collapsed
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}
