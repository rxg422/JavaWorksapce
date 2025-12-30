package com.kh.chap06.method.model.vo;

public class MethodTest1 {
	
	public void method1() {
		System.out.println("Method1 : 매개변수x, 반환값x");
	}
	
	public int method2() {
		System.out.println("Method1 : 매개변수x, 반환값o");
		
		return (int)(Math.random()*100+1);
	}
	
	public void method3(int x, int y) {
		System.out.println("Method1 : 매개변수o, 반환값x");

		int max = x>=y ? x:y;
		int min = x<=y ? x:y;
		
		System.out.printf("min : %d, max : 5d\n", min, max);
	}
	
	public int method4(int a, int b) {
		System.out.printf("Method1 : 매개변수o, 반환값o \n %d + %d = %d\n", a, b, a+b);
		
		return a * b;
	}
	
}
