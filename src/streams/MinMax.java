package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("A", 7.1),
                new Student("B", 6.1),
                new Student("C", 8.1),
                new Student("D", 10)
        );

        Comparator<Student> bestGrade = (s1, s2) -> {
            if (s1.grade > s2.grade) return 1;
            if (s1.grade < s2.grade) return -1;
            return 0;
        };

        System.out.println(studentList.stream().max(bestGrade).get());
        System.out.println(studentList.stream().min(bestGrade).get());
    }
}
