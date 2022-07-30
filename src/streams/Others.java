package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Others {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("A", 7.1),
                new Student("B", 6.1),
                new Student("C", 8.1),
                new Student("D", 10),
                new Student("E", 7.1),
                new Student("B", 6.1),
                new Student("F", 8.1),
                new Student("D", 10)
        );

        System.out.println("Distinct...");
        studentList.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip and Limit");
        studentList.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTake while");
        studentList.stream()
                .distinct()
                .skip(2)
                .takeWhile(student -> student.grade >= 7)
                .forEach(System.out::println);
    }
}
