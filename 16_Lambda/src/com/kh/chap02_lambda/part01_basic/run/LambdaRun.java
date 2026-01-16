package com.kh.chap02_lambda.part01_basic.run;

import com.kh.chap02_lambda.mode.functinal.LambdaTest1;

public class LambdaRun {

	public static void main(String[] args) {
		LambdaTest1 lambda1 = new LambdaTest1() {
			
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		
		int result = lambda1.add(1, 9);
		System.out.println(result);
		
		
		
		LambdaTest1 lambda2 = (int a, int b) -> {
			return a + b;
		};
		
		System.out.println(lambda2.add(3, 2));
	}
	
}
