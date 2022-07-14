package classe;

public class Date {
    int day;
    int month;
    int year;

    Date () {
        this(1, 1, 1970);
        // Calls another constructor, so watch out not to call twice and create a loop
    }

    Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String getFormattedDate() {
        return String.format("%02d/%02d/%02d", day, month, year);
    }

    void printFormattedDate() {
        System.out.printf("%s\n", getFormattedDate());
    }
}
