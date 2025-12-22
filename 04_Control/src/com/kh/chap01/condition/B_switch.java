package com.kh.chap01.condition;

import java.util.Scanner;

// switch문 : 정밀한 연산 결과가 동일한 속도로 사용되어야하는 경우 사용, if=else 보다 빠름
public class B_switch {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
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
	
	public void method2() {
		System.out.print("과일 : ");
		String fruit = sc.next();
		
		int price = 0;
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "망고" : case "복숭아" :
			price = 5000;
			break;
		case "바나나" :
			price = 2000;
			break;
		default :
			System.out.println("해당 과일을 구매할 수 없습니다.");
		}
		
		System.out.printf("가격은 %d원입니다.", price);
	}
	
}
