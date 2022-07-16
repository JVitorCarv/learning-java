package oop.composition.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Student {
    final List<Course> courses = new ArrayList<>();
    final String name;

    public String toString() {
        return name;
    }

    Student(String name) {
        this.name = name;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }

    Course getCourse(String title) {
        for (Course course: this.courses) {
            if (course.title.equalsIgnoreCase(title)) {
                return course;
            }
        }
        return null;
    }
}
