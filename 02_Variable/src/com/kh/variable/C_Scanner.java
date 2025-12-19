package com.kh.variable;

import java.util.Scanner;

public class C_Scanner {
	
	public void inputTest1() {
		Scanner scan = new Scanner(System.in);
		
		// next() : 공백 기준으로 값을 가져옴 / nextLine() : 엔터(\n) 기준으로 값을 가져옴
//		System.out.print("성함 : ");
//		String name = scan.nextLine();

		System.out.print("성 : ");
		String firstName = scan.next();
		scan.nextLine(); // 개행문자 비우기
		System.out.print("이름 : ");
		String lastName = scan.nextLine();
		System.out.println(lastName + ' ' + firstName);
		
		System.out.println("나이 : ");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("키 : ");
		Double height = scan.nextDouble();
		
		System.out.println("성별(M/F) : ");
		char gender = scan.next().charAt(0); // 0은 추출하고자하는 index를 의미
		
		scan.close();
	}
	
}
