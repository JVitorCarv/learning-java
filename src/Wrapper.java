import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;

        Integer i = Integer.parseInt(input.next());
        Long l = 100000L;

        input.close();
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);

    }
}
