package com.kh.chap01_innerClass.part04_anoymous;

public class OuterClass4 {
	public Runnable runner = new Runnable() {
		private int num = 20;
		
		public void run() {
			System.out.println(num);
		}
	};
	

	public Runnable getRunnable() {
		return new Runnable() {
			private int num = 10;

			@Override
			public void run() {
				System.out.println(num);
			}
		};
	}
	
}
