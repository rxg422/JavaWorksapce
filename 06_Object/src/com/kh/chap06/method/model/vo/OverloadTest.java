package com.kh.chap06.method.model.vo;

public class OverloadTest {
	
	public void overload() {
		System.out.println("Method Overload Test Void");
	}
	
	public void overload(String name) {
		System.out.println(name);
	}
	
	public int overload(int a) {
		System.out.println("Method Overload Test Int");
		
		return a;
	}
	
	
	
}
