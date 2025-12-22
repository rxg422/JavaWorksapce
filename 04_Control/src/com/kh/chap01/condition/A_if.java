package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {
	
	public Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("정수 : ");
		int i = sc.nextInt();
		
		if(i > 0) {
			System.out.println("양수입니다");
		}
		if(i <= 0) {
			System.out.println("0또는 음수입니다");
		}
	}
	
	public void method2() {
		System.out.print("정수 : ");
		int i = sc.nextInt();
		
		if(i > 0) {
			System.out.println("양수입니다");
		}
		else {
			System.out.println("0또는 음수입니다");
		}
	}
	
	public void method3() {
		System.out.print("정수 : ");
		int i = sc.nextInt();
		
		if(i > 0) {
			System.out.println("양수입니다");
		}
		else if(i == 0) {
			System.out.println("0입니다");
		}
		else {
			System.out.println("음수입니다");
		}
	}
	
	public void method4() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이입니다.");
		}
		else if(age <= 19) {
			System.out.println("청소년입니다.");
		}
		else if(age <= 60) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("어르신입니다.");
		}
	}
	
	public void method5() {
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("성별(m/f) : ");
		char gender = sc.next().charAt(0);
		
		String genderStr;
		if(gender == 'm' || gender == 'M') {
			genderStr = "남성";
		}
		else {
			genderStr = "여성";
		}
		
		System.out.println(name + '(' + genderStr + ')');
	}
	
	public void method6() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		// 자바에서 String 변수에는 주소값이 저장됨. 따라서 연산자를 사용하여 비교불가
		// equals()를 이용하여 비교가능
		if(name.equals("김태환")) {
			System.out.println("일치");
		}
		else {
			System.out.println("불일치");
		}
	}
	
}
