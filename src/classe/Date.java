package classe;

public class Date {
    int day;
    int month;
    int year;

    Date () {
        day = 1;
        month = 1;
        year = 1970;
    }

    Date (int initialDay, int initialMonth, int initialYear) {
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    String getFormattedDate() {
        return String.format("%02d/%02d/%02d", day, month, year);
    }

    void printFormattedDate() {
        System.out.printf("%s\n", getFormattedDate());
    }
}
