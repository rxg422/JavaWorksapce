package com.kh.practice01.thread;

public class MultiThreadTest {

	public static void main(String[] args) {
		Data data = new Data();
		
		Thread provider = new Thread(new Provider(data));
		Thread costomer = new Thread(new Customer(data));
		
		provider.start();
		costomer.start();
	}
	
}
