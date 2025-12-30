package com.kh.chap04.field.model.vo;

public class FieldTest1 {
	
	private int global; { // 전역 변수

		global = 50;
	}
	
	public static int num;
	// static 변수 초기화 블럭
	static {
		num = 55;
	}
	
	public void test(int n) { // 매개 변수
		int local; // 지역 변수
		
		if(true) {
			int a=97;
		}
		
//		System.out.println(local); // 초기화 필수(stack 메모리)
		System.out.println(global); // 자동 초기화(heap 메모리)
		System.out.println(n); // 메서드 호출 시 초기화
//		System.out.println(a); // 특정 영역(if) 종료로 변수 소멸
		
		FieldTest2 ft2 = new FieldTest2();
		
		System.out.println(ft2.pub);
		System.out.println(ft2.pro);
		System.out.println(ft2.df);
//		System.out.println(ft2.pri);
	}
	
}
