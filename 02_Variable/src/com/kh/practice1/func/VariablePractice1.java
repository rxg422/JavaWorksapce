package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) :");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 :");
		short age = sc.nextShort();
		
		System.out.print("키를 입력하세요(cm) :");
		float height = sc.nextFloat();
		
		System.out.printf("키 %.1fcm인 %d살 %c %s님 반갑습니다^^", height, age, gender, name);
	}
	
	public void practice2() {
		System.out.print("첫 번째 정수 : ");
		int i = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int j = sc.nextInt();
		
		System.out.printf("더하기 결과 : %d\n", i + j);
		System.out.printf("빼기 결과 : %d\n", i - j);
		System.out.printf("곱하기 결과  : %d\n", i * j);
		System.out.printf("나누기 몫 결과 : %d\n", i / j);
	}
	
	public void practice3() {
		System.out.print("가로 : ");
		Double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		Double height = sc.nextDouble();
		
		System.out.printf("면적 : %.2f\n", width * height);
		System.out.printf("둘레 : %.2f\n", 2 * (width + height));
	}
	
	public void practice4() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
	}
	
}
