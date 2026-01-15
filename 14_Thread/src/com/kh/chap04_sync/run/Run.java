package com.kh.chap04_sync.run;

import com.kh.chap04_sync.sync.ATM;
import com.kh.chap04_sync.sync.Account;

public class Run {
	
	public static void main(String[] args) {
		Account acc = new Account();
		Thread atm1 = new Thread(new ATM(acc), "ATM 1");
		Thread atm2 = new Thread(new ATM(acc), "ATM 2");
		
		atm1.start();
		atm2.start();
	}
	
}
