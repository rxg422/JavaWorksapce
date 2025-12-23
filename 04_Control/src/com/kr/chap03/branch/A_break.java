package com.kr.chap03.branch;

import java.util.Scanner;

public class A_break {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		int rand;
		
		while(true) {
			rand = (int)(Math.random()*1000 + 1);
			System.out.println("랜덤 값 : " + rand);
			
			if(rand % 3 == 0) {
				System.out.println("반복을 종료합니다.");
				break;
			}
		}
	}
	
	public void method2() {
		String str;
		
		while(true) {
			System.out.print("문자열 : ");
			str = sc.nextLine();
			
			if(str.equals("quit")) {
				break;
			}
			
			System.out.println("문자열 글자 수 : " + str.length());
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}
	
	public void method3() {
		int n;
		
		while(true) {
			System.out.print("양수 : ");
			n = sc.nextInt();
			
			if(n > 0) {
				for(int i=0; i<n; i++) {
					System.out.printf("%2d ", (i+1));
					if((i+1)%10==0) {
						System.out.println();
					}
				}
				
				break;
			}
			
			System.out.println("올바른 수를 입력해주세요.");
		}
	}
	
	public void method3_1() {
		int n;
		
		while(true) {
			System.out.print("양수 : ");
			n = sc.nextInt();
			
			if(n <= 0) {
				System.out.println("올바른 수를 입력해주세요.");
				continue;
			}
			
			for(int i=0; i<n; i++) {
				System.out.printf("%2d ", (i+1));
				if((i+1)%10==0) {
					System.out.println();
				}
			}
			
			break;
		}
	}
	
	public void method4() {
		// 심볼 : 심볼을 지정하여 해장 반복문 종료 가능
		loop1:
		for(int i=0; i<10; i++) {
			loop2:
			for(int j=0; j<10; j++) {
				System.out.println(i);
				if(i==5) {
					break loop1;
				}
			}
		}
	}
	
}
