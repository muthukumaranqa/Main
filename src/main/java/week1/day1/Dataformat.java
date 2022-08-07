package week1.day1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;

public class Dataformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		LocalDate yesterday = localDate.minusDays(1);
		LocalDate tomorrow = localDate.plusDays(1);
		System.out.println(localDate);
		System.out.println(yesterday);
		System.out.println(tomorrow);
		String dateString = FOMATTER.format(localDate);
		String dateStringyesterday = FOMATTER.format(yesterday);
		String dateStringtomorrow = FOMATTER.format(tomorrow);
		System.out.println(dateString);
		System.out.println(dateStringyesterday);
		System.out.println(dateStringtomorrow);

	}

}
