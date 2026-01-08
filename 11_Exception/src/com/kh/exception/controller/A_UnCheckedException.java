package com.kh.exception.controller;

import java.util.InputMismatchException;
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
	
	public void method2() {
		int n;
		
		System.out.print("0을 제외한 정수 : ");
		try {
			n = sc.nextInt();
			System.out.println("나눗셈 결과 : " + (10/n));
		} 
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다..");
		}
		catch (InputMismatchException e) {
			System.out.println("정수를 입력해주세요.");
		}
		
		
	}
	
	public void method3() {
		int size;
		
		try {
			System.out.print("배열 크기 : ");
			size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("100번째 값 : " + arr[100]);
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해주세요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기가 101보다 작습니다.");
		} catch (NegativeArraySizeException e) {
			System.out.println("양수를 입력해주세요.");
		}
		
		try {
			System.out.print("배열 크기 : ");
			size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("100번째 값 : " + arr[100]);
		} catch (RuntimeException e) {
			System.out.println("RuntimeException 발생");
			e.printStackTrace();
		}
		
		try {
			System.out.print("배열 크기 : ");
			size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("100번째 값 : " + arr[100]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bound");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException 발생");
			e.printStackTrace();
		}
	}
	
}
