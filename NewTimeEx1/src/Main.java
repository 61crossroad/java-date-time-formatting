import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1986, 10, 18);
        LocalTime birthTime = LocalTime.of(11, 22, 32);

        System.out.println("today = " + today);
        System.out.println("now = " + now);
        System.out.println("birthDate = " + birthDate);
        System.out.println("birthTime = " + birthTime);

        System.out.println(birthDate.withYear(2000));
        System.out.println(birthDate.plusDays(1));
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS));

        System.out.println(birthTime.truncatedTo(ChronoUnit.MINUTES));

        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
        System.out.println(ChronoField.HOUR_OF_DAY.range());
    }
}
