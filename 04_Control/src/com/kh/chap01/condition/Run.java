package com.kh.chap01.condition;

public class Run {

	public static void main(String[] args) {
		A_if a = new A_if();
		B_switch b = new B_switch();
		
//		a.method1();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
		
//		b.method1();
		b.method2();
		
		a.sc.close();
		b.sc.close();
	}

}
