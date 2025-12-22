package com.kh.chap02.loop;

import java.util.Scanner;

public class A_for {

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		for(int i=0; i<5; i++) {
			System.out.println("Count: " + (i+1));
		}
	}
	
	public void method2() {
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + " \n");
		}
	}
	
	public void method3() {
		for(int i=1; i<10; i+=2) {
			System.out.print(i+" \n");
		}
	}
	
	public void method4() {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.printf("1~10의 합 : %d\n", sum);
	}
	
	public void method5() {
		int n = (int)(Math.random()*10+1);
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		
		System.out.printf("1부터 %d까지의 합 : %d", n, sum);
	}
	
	public void method6() {
		String str = "Hello Friends";
		
		for(int i=0; i<str.length(); i++) {
			System.out.print("\'"+str.charAt(i)+"\',");
		}
	}
	
	public void method7() {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d단\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%d ", i, j, i*j);
			}
			System.out.println("\n");
		}
	}
	
}
