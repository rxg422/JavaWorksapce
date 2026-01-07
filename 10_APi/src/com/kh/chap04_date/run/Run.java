package com.kh.chap04_date.run;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	public static void main(String[] args) {
//		test1();
		test2();
//		test3();
//		test4();
//		test5();
	}
	
	public static void test1() {
		Calendar c1 = new GregorianCalendar();
		Calendar c2 = Calendar.getInstance();
		
		System.out.println(c1);
		
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH)+1); // 월은 0부터 시작
		System.out.println(c1.get(Calendar.DATE));
		
		System.out.println(c1.get(Calendar.HOUR));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		System.out.println(c1.get(Calendar.MINUTE));
		System.out.println(c1.get(Calendar.SECOND));
		
		printCalendar(c1);
	}
	

	
	public static void test2() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar(2027, 1, 1, 0, 0, 0);
		
		c1.set(2027, 0, 1, 0, 0, 0);
		System.out.println(c1);
		
		Calendar now = Calendar.getInstance();
		Calendar dDay = new GregorianCalendar(2026, 0, 27);
		
		long num1 = now.getTimeInMillis();
		long num2 = dDay.getTimeInMillis();
		
		
		
		double diff = (num2-num1) / 1000.0 / 60 / 60 / 24;
		System.out.println(Math.ceil(diff));
	}
	
	
	public static void test3() {
		// 기본 생성자를 통해 Date 객체 생성 - 현재 날짜 및 시간을 가지고 생성
		Date today = new Date();
		System.out.println("기본 생성자 : " + today);
		
		Date date1 = new Date(2002-1900, 04, 22); // 권장 안함
		System.out.println("매개변수 : " + date1);
		
		Calendar c2 = new GregorianCalendar(2025, 5, 19);
		Date date2 = new Date(c2.getTimeInMillis());
		System.out.println("millisec 매개변수 : " + date2);
		
		System.out.println();
	}
	
	
	public static void test4() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String formatDate = sdf.format(new Date());
		System.out.println(formatDate);
	}
	
	public static void test5() {
		// # : 데이터가 없으면 생략
		// 0 : 데이터가 없으면 0으로 표시
		double num = 1234567890.123;
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		df.applyPattern("#.00000");
		
		System.out.println(df.format(num));
	}
	
	
	public static void printCalendar(Calendar c) {
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",
                          c.get(Calendar.YEAR),
                          c.get(Calendar.MONTH) + 1,
                          c.get(Calendar.DATE),
                          c.get(Calendar.HOUR_OF_DAY),
                          c.get(Calendar.MINUTE),
                          c.get(Calendar.SECOND)
                );
    }

}
