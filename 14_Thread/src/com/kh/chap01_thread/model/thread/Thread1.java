package com.kh.chap01_thread.model.thread;

public class Thread1 extends Thread {

	// 각 Thread가 실행할 작업을 
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.printf("Thread 1[%2d]\n", i);
		}
	}
	
}
