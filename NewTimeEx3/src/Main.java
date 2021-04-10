import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(temporal -> temporal.plus(2, ChronoUnit.DAYS));
        p("date (Lambda) = ", date);
        LocalDate date2 = today.with(new DayAfterTomorrow());
        p("date2 (TemporalAdjuster) = ", date2.getDayOfWeek());

        p("today = ", today);
        p("date = ", date);
        p("firsyDayOfNextMonth() = ", today.with(firstDayOfNextMonth()));
        p("firstDayOfMonth() = ", today.with(firstDayOfMonth()));
        p("lasyDayOfMonth() = ", today.with(lastDayOfMonth()));
        p("firstInMonth(TUESDAY) = ", today.with(firstInMonth(TUESDAY)));
        p("lastInMonth(TUESDAY) = ",today.with(lastInMonth(TUESDAY)));
        p("previous(TUESDAY) = ", today.with(previous(TUESDAY)));
        p("previousOrSame(TUESDAY) = ", today.with(previousOrSame(TUESDAY)));
        p("next(TUESDAY) = ", today.with(next(TUESDAY)));
        p("nextOrSame(TUESDAY) = ", today.with(nextOrSame(TUESDAY)));
        p("dayOfWeekInMonth(4, TUESDAY) = ", today.with(dayOfWeekInMonth(4, TUESDAY)));
    }

    static void p(String field, Object obj) {
        System.out.println(field + obj);
    }
}
