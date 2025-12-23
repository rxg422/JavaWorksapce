package com.kr.chap03.branch;

public class B_continue {
	
	public void method1() {
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.printf("%d ", i);
		}
	}
	
	public void method2() {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 6 == 0) {
				continue;
			}
			
			sum += i;
		}
		
		System.out.printf("6의 배수를 제외한 1~100의 합 : %d", sum);
	}
	
}
