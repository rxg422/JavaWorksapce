package com.kh.practice01.thread;

import java.util.Random;

public class Provider extends Thread {

	private Data data;

	public Provider(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		int num;
		
		for(int i=0; i<10; i++) {
			num = new Random().nextInt(100)+1;
			
			data.setValue(num);
			System.out.println("put value : " + num);
			
			try {
				Thread.sleep(100);
			} 
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
