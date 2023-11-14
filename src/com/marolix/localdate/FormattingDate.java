package com.marolix.localdate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDate {

	public static void main(String[] args) {
		// LocalDateTime date = LocalDateTime.of(2023, 1, 12, 13, 45, 22);

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("before foramtting " + date);
//d->date
		String pattern = "dd,MMMM YYYY    HH:mm:ss a EEEE";
//		SimpleDateFormat format = new SimpleDateFormat(pattern);
//		String s = format.format(date);
//		System.out.println(s);

//		String s = date.format(DateTimeFormatter.ofPattern(pattern));//runtime exception
//
//		System.out.println(s);
	}

}
