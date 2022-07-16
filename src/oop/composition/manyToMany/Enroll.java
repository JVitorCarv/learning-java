package oop.composition.manyToMany;

public class Enroll {
    public static void main(String[] args) {
        Student student1 = new Student("Vitor");
        Student student2 = new Student("José");
        Student student3 = new Student("Carvalho");

        Course course1 = new Course("Java OOP");
        Course course2 = new Course("JavaScript Webdev");
        Course course3 = new Course("Python Machine Learning");

        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student1);
        course2.addStudent(student3);

        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        for (Student student: course1.students) {
            System.out.println("Course 1: " + student.name);
        }

        for (Student student: course2.students) {
            System.out.println("Course 2: " + student.name);
        }

        for (Student student: course3.students) {
            System.out.println("Course 3: " + student.name);
        }

        System.out.println(student1.name + "'s courses: ");
        for (Course course: student1.courses) {
            System.out.println("- " + course.title);
        }

        System.out.println(student1.courses.get(0).students);

        Course search1 = student3.getCourse("java oop");
        Course search2 = student3.getCourse("python machine learning");

        if (search1 != null) {
            System.out.println(search1.students);
        } else {
            System.out.println("This student is not enrolled to the course");
        }

        if (search2 != null) {
            System.out.println(search2.students);
        } else {
            System.out.println("This student is not enrolled to the course");
        }

    }
}
