package ch10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class NewTimeEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		p(today);
		p(date);
		p(today.with(TemporalAdjusters.firstDayOfNextMonth()));
		p(today.with(TemporalAdjusters.firstDayOfMonth()));
		p(today.with(TemporalAdjusters.lastDayOfMonth()));
		p(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY)));
		p(today.with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY)));
		p(today.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)));
		p(today.with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY)));
		p(today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		p(today.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));
		p(today.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));
		
	}
	
	static void p(Object obj) {
		System.out.println(obj);
	}

}

class DayAfterTomorrow implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
}
