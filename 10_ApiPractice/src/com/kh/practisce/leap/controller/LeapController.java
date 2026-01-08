package com.kh.practisce.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		
		return false;
	}
	
	public long leapDate(Calendar c) {
		Calendar day = new GregorianCalendar(1, 0, 1);
		
		long total = 0;
		for(int i=1; i<=c.get(Calendar.YEAR); i++) {
			if(isLeapYear(i)) {
				total += 366;
			}
			else {
				total += 365;
			}
		}
		
		long num1 = c.getTimeInMillis();
		long num2 = day.getTimeInMillis();
		
		long diff = (num1-num2) / 1000 / 60 / 60 / 24;
		
		return diff;
	}
	
}
