package com.kh.chap01_thread.model.thread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.printf("Thread 2[%2d]\n", i);
		}
	}

}
