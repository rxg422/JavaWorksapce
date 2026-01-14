package com.kh.chap03_control.run;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	public static void test1() {
		Thread a = new Thread(() -> {
			for(int i=0; i<100; i++) {
				System.out.print("-");
				
				try {
					Thread.sleep(50);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread b = new Thread(() -> {
			for(int i=0; i<100; i++) {
				System.out.print("|");
				
				try {
					Thread.sleep(30);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		a.start();
		b.start();
	}
	
	public static void test2() {
		Thread cnt = new Thread(()-> {
			for(int i=0; i<100; i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
				} 
				catch(InterruptedException e) {
					e.printStackTrace();
					break;
				}
			}
		});
		
		cnt.start();
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료하시려면 exit를 입력하시오 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				cnt.interrupt();
			}
		}
	}
	
}
