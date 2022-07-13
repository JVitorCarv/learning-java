package classe;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.day = 10;
        d1.month = 7;
        d1.year = 2003;
        d1.printFormattedDate();

        Date d2 = new Date();
        System.out.printf("%s\n", d2.getFormattedDate());

        Date d3 = new Date(13, 7, 2022);
        d3.printFormattedDate();
    }
}
