package exceptions;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(7 / sc.nextInt());
        } catch (Exception e) {
            // Just using Exception would leave the Scanner still open,
            // since the program was interrupted before it being closed
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing Scanner instance...");
            sc.close();
        }
        System.out.println("End!");
    }
}
