package com.kh.chap04_sync.sync;

import java.util.Random;

public class ATM implements Runnable {

	private Account acc;
	
	public ATM(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		while(acc.getBalance()>300) {
			int money = (new Random().nextInt(3)+1)*300;
			acc.withdraw(money);
			
			try {
				Thread.sleep(200);
			} 
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " 종료");
	}
	
}
