import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate newYear = LocalDate.parse("2022-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("newYear = " + newYear);

        LocalDate date = LocalDate.parse("2022-01-01");
        LocalTime time = LocalTime.parse("23:59:59");
        LocalDateTime dateTime = LocalDateTime.parse("2022-01-01T23:59:59");
        System.out.println("date = " + date);
        System.out.println("time = " + time);
        System.out.println("dateTime = " + dateTime);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endOfYear = LocalDateTime.parse("2021-12-31 23:59:59", pattern);
        System.out.println("endOfYear = " + endOfYear);
    }
}
