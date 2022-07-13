package classe;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.day = 10;
        d1.month = 7;
        d1.year = 2003;
        d1.printFormattedDate();

        Date d2 = new Date();
        d2.day = 9;
        d2.month = 5;
        d2.year = 1988;
        System.out.printf("%s", d2.getFormattedDate());
    }
}
