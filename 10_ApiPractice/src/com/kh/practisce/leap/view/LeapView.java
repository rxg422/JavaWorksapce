package com.kh.practisce.leap.view;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practisce.leap.controller.LeapController;

public class LeapView {

	Scanner sc = new Scanner(System.in);
	LeapController lc = new LeapController();
	
	public LeapView() {
		System.out.print("Year : ");
		int year = sc.nextInt();
		
		if(lc.isLeapYear(year)) {
			System.out.println(year + "년은 윤년입니다.");
		}
		else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		Calendar now = Calendar.getInstance();
		System.out.println(lc.leapDate(now));
	}
	
}
