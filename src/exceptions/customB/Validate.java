package exceptions.customB;

import exceptions.Student;

public class Validate {
    private Validate(){}

    public static void student(Student student) throws EmptyStringException, NumberOutOfIntervalException {
        if (student == null) {
            throw new IllegalArgumentException("The student is null");
        }

        if (student.name == null || student.name.trim().isEmpty()) {
            throw new EmptyStringException("name");
        }

        if (student.grade < 0 || student.grade > 10) {
            throw new NumberOutOfIntervalException("grade");
        }
    }
}
