
public class DayOfTheYear {

    public static void main(String[] args) {

        long millis = System.currentTimeMillis();

        long totalDays = millis / (1000 * 60 * 60 * 24);

        long year = 1970 + totalDays / 365;
        long dayOfYear = totalDays % 365;

        System.out.println("Year: " + year);
        System.out.println("Day of year: " + dayOfYear);
    }
}
