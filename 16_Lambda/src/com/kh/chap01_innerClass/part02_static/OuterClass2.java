package com.kh.chap01_innerClass.part02_static;

public class OuterClass2 {

	private String str = "필드";
	private static String sStr = "정적 필드";
	
	// 정적 내부클래스 : 외부클래스에 종속적이지 않으며, 하나의 클래스 파일에 다양한 클래스를 설계할 때 사용
	public static class StaticInnerClass {
		
		private int num = 100;
		private static int num2 = 100;
		
		public void test() {
			System.out.println(sStr);
		}
		
	}
	
}
