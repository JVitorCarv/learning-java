package oop.composition.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Course {
    final List<Student> students = new ArrayList<>();
    final String title;

    Course(String title) {
        this.title = title;
    }

    void addStudent(Student student) {
        this.students.add(student);
        student.courses.add(this);
    }
}
