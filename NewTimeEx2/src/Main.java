import java.time.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate date = LocalDate.of(2021, 4, 10);
        LocalTime time = LocalTime.of(18, 20, 11);

        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println("dt = " + dt);

        ZoneId zid = ZoneId.of("Asia/Seoul");
        System.out.println("zid = " + zid);
        ZonedDateTime zdt = dt.atZone(zid);
        System.out.println("zdt = " + zdt);
        OffsetDateTime odt = zdt.toOffsetDateTime();
        System.out.println("odt = " + odt);
        String strZid = zdt.getZone().getId();
        System.out.println("strZid = " + strZid);

        ZonedDateTime seoulTime = ZonedDateTime.now();
        System.out.println("seoulTime = " + seoulTime);
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
        System.out.println("nyTime = " + nyTime);
    }
}
