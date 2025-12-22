package com.kh.chap01.condition;

import java.util.Scanner;

// switch문 : 정밀한 연산 결과가 동일한 속도로 사용되어야하는 경우 사용, if=else 보다 빠름
public class B_switch {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("값 : ");
		int value = sc.nextInt();
		
		if(value==1) {
			System.out.println("빨간불");
		}
		else if(value==2) {
			System.out.println("파란불");
		}
		else if(value==3) {
			System.out.println("초록불");
		}
		else {
			System.out.println("잘못된 값을 입력하였습니다.");
		}
	}
	
	public void method2() {
		System.out.print("값 : ");
		int value = sc.nextInt();
		
		switch(value) {
		case 1:
			System.out.println("빨간불");
			break;
		case 2:
			System.out.println("파란불");
			break;
		case 3:
			System.out.println("초록불");
			break;
		default:
			System.out.println("잘못된 값을 입력하였습니다.");
		}
	}
	
	public void method3() {
		
	}
	
}
