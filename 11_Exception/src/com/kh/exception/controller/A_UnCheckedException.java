package com.kh.exception.controller;

import java.util.Scanner;

public class A_UnCheckedException {

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.println("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int n2 = sc.nextInt();

//		if(n2 == 0) {
//			System.out.println("ArithmeticException 발생으로 프로그램을 종료합니다.");
//			return;
//		}
		
		try {
			System.out.println("나눗셈 연산 : " + (n1/n2));
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
			e.printStackTrace(); // 오류를 로그로 출력
		}
	
		System.out.println("프로그램 종료");
	}
	
}
