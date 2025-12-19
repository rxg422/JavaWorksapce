package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	
	public Scanner scan = new Scanner(System.in);
	
	public void method1() {
		System.out.print("숫자 : ");
		int i = scan.nextInt();
		
		System.out.println(i>0 && i%2==0);
	}
	
	public void method2() {
		System.out.print("정수 : ");
		int i = scan.nextInt();
		
		System.out.println(i>=1 && i<=100);	
	}
	
	public void method3() {
		System.out.println("계속 진행하시려면 y를 눌러주세요");
		char c = scan.next().charAt(0);
		
		System.out.println(c=='y' || c=='Y');
	}
	
	public void method4() {
		int num1 = 10;
		int num2 = 10;
		// &&연산자의 경우 A&&B의 조건 중 A의 값이 false인 경유 뒤 조건식 실행 x
		boolean result1 = num1<5 && num1++ > 0;
		System.out.println(result1);
		
		boolean result2 = num2 < 20 || ++num2 > 0;
		System.out.println(result2);
	}
	
}
