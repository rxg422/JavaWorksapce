package com.kh.practice01.thread;

public class Data {
	
	private int value;
	private boolean isEmpty = true;
	
	public Data() {
		// TODO Auto-generated constructor stub
	}
	
	public void setValue(int value) {
		synchronized (this) {
			if(!isEmpty) {
				try {
					wait();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			isEmpty = false;
			notify();
			this.value = value;
		}
		
		
	}
	
	public int getValue() {
		synchronized (this) {
			if(isEmpty) {
				try {
					wait();
					throw new EmptyException("현재입력된 값이 없습니다. 기다리세요..");
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}catch (EmptyException e) {
					
				}
			}
			isEmpty = true;
			notify();
			return value;
		}
	}
	
}
