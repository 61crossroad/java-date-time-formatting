import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2021, 3, 15);
        Period pe = Period.between(date1, date2);
        p("date1 = ", date1);
        p("date2 = ", date2);
        p("period = ", pe);

        p("YEAR = ", pe.get(ChronoUnit.YEARS));
        p("MONTH = ", pe.get(ChronoUnit.MONTHS));
        p("DAY = ", pe.get(ChronoUnit.DAYS));

        LocalTime time1 = LocalTime.of(9, 0, 0);
        LocalTime time2 = LocalTime.of(16, 5, 23);
        Duration du = Duration.between(time1, time2);
        p("time1 = ", time1);
        p("time2 = ", time2);
        p("duration = ", du);

        LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
        p("HOUR = ", tmpTime.getHour());
        p("MINUTE = ", tmpTime.getMinute());
        p("SECOND = ", tmpTime.getSecond());
        p("NANO = ", tmpTime.getNano());
    }

    static void p(String str, Object obj) {
        System.out.println(str + obj);
    }
}
