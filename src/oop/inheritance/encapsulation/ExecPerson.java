package oop.inheritance.encapsulation;

public class ExecPerson {
    public static void main(String[] args) {
        Person p1 = new Person(30);
        System.out.println(p1.getAge());
        p1.setAge(-20);
        System.out.println(p1.getAge());
    }
}
