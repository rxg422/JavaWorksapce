package com.kh.chap01_innerClass.part03_local;

public class OuterClass3 {

	private String str = "일반필드";
	private static String staticStr = "정적필드";
	
	public Runnable getRunnable(int num2) {
		int local = 1;
		
		class LocalInnerClass implements Runnable {
			private int num = 10;

			@Override
			public void run() {
				System.out.println(local);
				System.out.println(num);
				System.out.println(num2);
				System.out.println(str);
				System.out.println(staticStr);
			}
		}
		
		return new LocalInnerClass();
	}
	
}
