package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("A", 7.1),
                new Student("B", 6.1),
                new Student("C", 8.1),
                new Student("D", 10)
        );

        Predicate<Student> approved = s -> s.grade >= 7;

        System.out.println(studentList.stream().allMatch(approved));
        System.out.println(studentList.stream().anyMatch(approved));
        System.out.println(studentList.stream().noneMatch(approved));
    }
}
