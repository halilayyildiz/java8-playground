package com.halilayyildiz.test.j8;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTimeExamples {

	public static void main(String[] args) {

		/*
			For dates and times without a timezone, use the following:
	
			* LocalDate – Day, month, year.
			* LocalTime – Time of day only.
			* LocalDateTime – Both date and time.
			
			For timezone specific times you use 
			* ZonedDateTime.
		
		*/
		
		LocalTime now = LocalTime.now();
		LocalDate today = LocalDate.now();
		
		System.out.println("1 --------------------------");
		LocalTime later1 = now.plus(8, ChronoUnit.HOURS);
		System.out.println(later1);
		LocalTime later2 = now.plusMinutes(23);
		System.out.println(later2);
		
		
		System.out.println("2 --------------------------");
		LocalDate thirtyDaysFromNow = today.plusDays(30);
		System.out.println(thirtyDaysFromNow);
		LocalDate nextMonth = today.plusMonths(1);
		System.out.println(nextMonth);
		LocalDate aMonthAgo = today.minusMonths(1);
		System.out.println(aMonthAgo);
		
		
		System.out.println("3 --------------------------");
		LocalDate date31 = LocalDate.of(2014, 3, 15);
		System.out.println(date31);
		LocalDate date32 = LocalDate.of(2014, Month.MARCH, 15);
		System.out.println(date32);
		
		
		System.out.println("4 --------------------------");
		LocalDate date33 = LocalDate.of(2014, 3, 15);
		LocalTime time33 = LocalTime.of(12, 15, 0);
		LocalDateTime datetime33 = date33.atTime(time33);
		System.out.println(datetime33);
		
		// Enums
		System.out.println("5 --------------------------");
		LocalDate today5 = LocalDate.now();
		System.out.println(today5);
		LocalDate nextWeek5 = today.plus(1, ChronoUnit.WEEKS);
		System.out.println(nextWeek5);
		LocalDate nextMonth5 = today.plus(1, ChronoUnit.MONTHS);
		System.out.println(nextMonth5);
		LocalDate nextYear5 = today.plus(1, ChronoUnit.YEARS);
		System.out.println(nextYear5);
		LocalDate nextDecade5 = today.plus(1, ChronoUnit.DECADES);
		System.out.println(nextDecade5);
		
		
		// Clock
		System.out.println("6 --------------------------");
		Clock clock = Clock.systemDefaultZone();
		LocalTime time6 = LocalTime.now(clock);
		System.out.println(time6);
		
		
		// Period and Duration
		System.out.println("7 --------------------------");
		LocalDate date71 = LocalDate.of(2014, 3, 15);
		LocalDate date72 = LocalDate.of(2014, 4, 15);
		Period period = Period.between(date71, date72);
		System.out.println(period);
		
		LocalTime time71 = LocalTime.of(12, 15, 0);
		LocalTime time72 = LocalTime.of(18, 22, 20);
		Duration duration = Duration.between(time71, time72);
		System.out.println(duration);
		
		
		// Period and Duration
		System.out.println("8 --------------------------");
		Duration twoHours = Duration.ofHours(2);
		System.out.println(twoHours);
		Duration tenMinutes = Duration.ofMinutes(11);
		System.out.println(tenMinutes);
		Duration thirtySecs = Duration.ofSeconds(32);
		System.out.println(thirtySecs);
		
		LocalTime time81 = LocalTime.of(12, 15, 0);
		LocalTime time82 = time81.plus(twoHours);
		System.out.println(time82);
	
		
		//Temporal Adjusters
		System.out.println("9 --------------------------");
		LocalDate nextTuesday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(nextTuesday);
		
		
		// Time Zones
		System.out.println("10 --------------------------");
		ZoneId mountainTime = ZoneId.of("America/Denver");
		System.out.println(mountainTime);
		ZoneId myZone = ZoneId.systemDefault();
		System.out.println(myZone);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		
		
		// Backwards Compatibility
		System.out.println("11 --------------------------");
		Date date = new Date();
		Instant now11 = date.toInstant();
		ZoneId myZone11 = ZoneId.systemDefault();
		LocalDateTime dateTime = LocalDateTime.ofInstant(now11, myZone11);
		System.out.println(dateTime);
		ZonedDateTime zdt = ZonedDateTime.ofInstant(now11, myZone11);
		System.out.println(zdt);
		
		
	}
	
}
