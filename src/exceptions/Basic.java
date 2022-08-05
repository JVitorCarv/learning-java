package exceptions;

public class Basic {
    public static void main(String[] args) {
        Student s1 = null;

        try {
            printStudent(s1);
        } catch (Exception e) {
            System.out.println("A problem occurred while trying to print student's name");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("End of program");
    }

    public static void printStudent(Student student) {
        System.out.println(student.name);
    }
}
