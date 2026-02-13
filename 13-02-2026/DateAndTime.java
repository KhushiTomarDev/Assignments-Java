
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

        public static void main(String[] args) {
           // LocalDate date = LocalDate.now();          // current date
           // LocalTime time = LocalTime.now();          // current time
            LocalDateTime dateTime = LocalDateTime.now(); // both

            System.out.println(dateTime);
            LocalDate date = LocalDate.of(2026, 2, 13);
            LocalTime time = LocalTime.of(10, 30);
            LocalDateTime dt = LocalDateTime.of(2026, 2, 13, 10, 30);
            
            System.out.println(time);    
            System.out.println(date);
            System.out.println(dt);
            LocalDate date1 = LocalDate.now();

            System.out.println(date1.plusDays(5));   // add 5 days
            System.out.println(date1.minusMonths(2)); // subtract 2 months
            System.out.println(date1.plusMonths(10)); // subtract 2 months

            LocalDate d1 = LocalDate.of(2026, 2, 10);
            LocalDate d2 = LocalDate.of(2026, 2, 15);

            if (d1.isBefore(d2)) {
                System.out.println("d1 is earlier");
            }

            LocalDate d3 = LocalDate.of(2026, 4, 18);
            LocalDate d4 = LocalDate.now();

            long days = ChronoUnit.DAYS.between(d3, d4);
            long months = ChronoUnit.MONTHS.between(d4, d3);
         

            System.out.println(days);
            System.out.println(months);
           
            ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
            ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));

            System.out.println(india);
            System.out.println(usa);

        }
    }


