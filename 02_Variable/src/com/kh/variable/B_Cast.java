package com.kh.variable;

import java.awt.Window.Type;

public class B_Cast {
	/*
	 형 변환 종류
	 1. 자동형변환
	 2. 강제형변환 : 형변환 연산자를 사용하여 직접 변환
	 */
	
	public void autoCasting() {
		int i = 10;
		double d = i; // double 자료형으로 자동으로 형변환 후 대입
		System.out.println("d = " + d);
		
		int i2 = 1000;
		double d2 = 3.3;
		double result = i2 + d2;
		System.out.println("result = " + result);
	
		int i3 = 1000;
		long l3 = i3;
		
		// 실수는 지수표기법을 사용하여 long 자료형보다 담을 수 있는 값의 범위가 큼
		long l4 = 100000000000L;
		float f4 = l4;
		System.out.println(f4);
		
		char c = 65;
		System.out.println(c);
		int num = 'a';
		System.out.println(num);
		
		// byte, short간의 연산 결과는 항상 int로 취급
//		byte b1 = 127;
//		byte b2 = 127;
//		byte b3 = b1 + b2;
	}

	public void forceCasting() {
		float f1 = 4.0f;
		double d2 = 8.0d;
		float f2 = (float)d2;
		
		double d3 = 10.89d;
		int i3 = (int)d3;
		System.out.println("i3 = " + i3);
	
		int iNum = 10;
		double dNum = 5.89d;
		int iSum = iNum + (int)dNum;
//		int iSum = (int)(iNum + dNum);
		System.out.println("iSum = " + iSum);
	}
	
}
