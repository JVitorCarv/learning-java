package classe;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.day = 10;
        d1.month = 7;
        d1.year = 2003;
        System.out.printf("%d/%d/%d\n", d1.day, d1.month, d1.year);

        Date d2 = new Date();
        d2.day = 9;
        d2.month = 5;
        d2.year = 1988;
        System.out.printf("%d/%d/%d\n", d2.day, d2.month, d2.year);
    }
}
