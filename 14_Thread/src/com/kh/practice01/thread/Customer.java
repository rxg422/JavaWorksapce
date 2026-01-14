package com.kh.practice01.thread;

public class Customer extends Thread {

	private Data data;

	public Customer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("get value : " + data.getValue());
			
			try {
				Thread.sleep(100);
			}
//			catch(EmptyException e) {
//				e.printStackTrace();
//			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
