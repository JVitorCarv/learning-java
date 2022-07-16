package whatever;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int informedNumber = sc.nextInt();

        while (informedNumber < 10) {
            System.out.println("Print something");
            informedNumber = sc.nextInt();
        }

        sc.close();
        System.out.println("Value informed was 10 or above");
    }
}
