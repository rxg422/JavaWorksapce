package com.kh.chap01_innerClass.part01_instance;

public class OuterClass {

	private String str = "외부클래스 필드";
	private static String staticStr = "외부클래스 정적 필드";
	private InnerClass inner;
	
	public OuterClass() {
		inner = new InnerClass();
	}
	
	// 인스턴스 내부 클래스
	private class InnerClass {
		private int num = 100;
		private static int sNum = 100;
		
		public void method1() {
			System.out.println(num);
			System.out.println(str);
			System.out.println(staticStr);
			System.out.println(sNum);
		}
	}
	
	public void method1() {
		inner.method1();
	}
	
}
