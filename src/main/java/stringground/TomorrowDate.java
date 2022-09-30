package stringground;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TomorrowDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String month = String.valueOf(date.getMonthValue() + 1);
		String year = String.valueOf(date.getYear());
		String nextMonth10thdate = month+"/10"+"/"+year;
		System.out.println(nextMonth10thdate);
        date = date.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        String nextDate = formatter.format(date);
        System.out.println(nextDate);
	}

}
