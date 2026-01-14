package com.kh.chap02_scheduling.run;

public class Run {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<20000; i++) {
				System.out.println("Car Driving...");
			}
		});
		t1.setName("Car");
		
		Thread t2 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<20000; i++) {
				System.out.println("Plane Flying...");
			}
		});
		t2.setName("Plane");
		
		Thread t3 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<20000; i++) {
				System.out.println("Tank Shooting...");
			}
		});
		t3.setName("Tank");
		

//		t1.setPriority(Thread.MAX_PRIORITY);
//		t3.setPriority(Thread.MIN_PRIORITY);

		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
