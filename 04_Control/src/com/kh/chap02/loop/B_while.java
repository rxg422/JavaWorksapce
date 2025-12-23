package com.kh.chap02.loop;

import java.util.Scanner;

public class B_while {
	
	public void method1() {
		int i = 0;
		
		while(i < 5) {
			System.out.println("i : " + (i+1));
			i++;
		}
	}
	
	public void method2() {
		int i = 0;
		
		while(i < 5) {
			System.out.print(++i + " ");
		}
	}
	
	public void method3() {
		int i=0;
		int sum=0;
		int rand = (int)(Math.random()*10 + 1);
		
		while(i<rand) {
			sum += ++i;
		}
		
		System.out.printf("1~%d의 합 : %d", rand, sum);
	}
	
	public void method4() {
		do {
			System.out.println("Hello");
		}
		while(false);
	}
	
	public void method5() {
		int i=0;
		
		do {
			System.out.print((++i) + " ");
		}
		while(i<5);
	}
	
	public void method() {
		
		Scanner sc = new Scanner(System.in);
		boolean state = true;
		
		while(state) {
			System.out.print("input : ");
			char input = sc.next().charAt(0);
			
			if(input == 'q') {
				state = false;
			}
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}
	
}
