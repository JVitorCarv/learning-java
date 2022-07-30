package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("A", 7.1),
                new Student("B", 6.1),
                new Student("C", 8.1),
                new Student("D", 10)
        );

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, Double> onlyGrade = s -> s.grade;

        BiFunction<Average, Double, Average> calcAvg = (avg, grade) -> avg.add(grade);
        BinaryOperator<Average> combineAvg = (a1, a2) -> Average.combine(a1, a2);

        Average avg = studentList.parallelStream()
                .filter(approved)
                .map(onlyGrade)
                .reduce(new Average(), calcAvg, combineAvg);

        System.out.println(avg.getValue());
    }
}
