package com.kh.chap01_thread.run;

import com.kh.chap01_thread.model.thread.Thread1;
import com.kh.chap01_thread.model.thread.Thread2;

public class Run {

	public static void main(String[] args) {
//		for(int i=0; i<100; i++) {
//			System.out.printf("작업1[%2d]\n", i);
//		}
//		for(int i=0; i<100; i++) {
//			System.out.printf("작업2[%2d]\n", i);
//		}
//		
//		// 일반 Thread 생성
//		Thread th1 = new Thread1();
//		// Thread 실행
//		th1.start();
//		
//		// Runnable Interfase
//		Thread th2 = new Thread(new Thread2());
//		
//		th2.start();
//		
//		// 내부 클래스
//		class Thread3 extends Thread {
//			@Override
//			public void run() {
//				System.out.println("Thread 3[Working]");
//			}
//		}
//		
//		Thread th3 = new Thread3();
//		th3.start();
//		
//		// 익명 내부 클래스
//		Thread th4 = new Thread() {
//			@Override
//			public void run() {
//				System.out.println("Thread 4[Working]");
//			}
//		};
//		th4.start();
//		
//		// 람다식
//		Thread th5 = new Thread(() -> {
//			System.out.println("Thread 5[Working]");
//		});
//		th5.start();
//		
//		System.out.println("메인 스레드 종료");
		
		/* 	
		[실습문제]
		알파벳 A~Z 까지 출력하는 스레드 생성
		알파벳 a~z 까지 출력하는 스레드 생성
		각 스레드 생성후 main스레드에서 실행.
		출력예시 :
		[대문자쓰레드 시작]
		[소문자쓰레드 시작]
		[대문자쓰레드 : A]
		[대문자쓰레드 : B]
		[소문자쓰레드 : a]
		[대문자쓰레드 : C]
		[소문자쓰레드 : b]
		....
		[소문자쓰레드 : z]
		[대문자쓰레드 : Z]
		[대문자쓰레드 종료]
		[소문자쓰레드 종료]
		 */
		Thread thAtoZ = new Thread(() -> {
			System.out.println("[대문자쓰레드 시작]");
			for(int i='A'; i<'Z'; i++) {
				System.out.printf("[대문자쓰레드 : %c]\n", i);
			}
			System.out.println("[대문자쓰레드 종료]");
		});
		
		Thread thatoz = new Thread(() -> {
			System.out.println("[소문자쓰레드 시작]");
			for(int i='a'; i<'z'; i++) {
				System.out.printf("[소문자쓰레드 : %c]\n", i);
			}
			System.out.println("[소문자쓰레드 종료]");
		});
		
		thAtoZ.start();
		thatoz.start();
	}
	
}
