package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingFilter {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Ana", 7.8),
                new Student("Charles", 5.8),
                new Student("Bob", 9.8),
                new Student("Gui", 6.8),
                new Student("Rebecca", 7.1)
        );

        Predicate<Student> approved = student -> student.grade >= 7;
        Consumer<Student> printApproved = s -> System.out.println(s.name + " was approved");

        studentList.stream()
                .filter(approved)
                .forEach(printApproved);
    }
}
