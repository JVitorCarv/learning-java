package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Bob", "William", "Lia");

        System.out.println("Traditional...");
        for (String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nLambda #01: ");
        approved.forEach(name -> System.out.println(name));

        System.out.println("\nMethod reference...");
        approved.forEach(System.out::println);

        System.out.println("\nUsing customized static method");
        approved.forEach(Foreach::myPrint);
    }

    static void myPrint(String name) {
        System.out.println("Hi, my name is " + name);
    }
}
