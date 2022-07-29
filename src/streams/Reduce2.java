package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("A", 7.1),
                new Student("B", 6.1),
                new Student("C", 8.1),
                new Student("D", 10)
        );

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, Double> onlyGrade = s -> s.grade;
        BinaryOperator<Double> total = (a, b) -> a + b;

        studentList.parallelStream()
                .filter(approved)
                .map(onlyGrade)
                .reduce(total)
                .ifPresent(System.out::println);
    }
}
