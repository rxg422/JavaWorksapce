package com.kh.array;

import java.util.Arrays;

public class B_arrayCopy {
	
	public void method1() {
		int origin[] = {1, 2, 3, 4, 5};
		int[] copy = origin;
		
		System.out.println("\n==========[얕은 복사]==========");
		System.out.print("원본 배열 : ");
		for(int i=0; i<origin.length; i++) {
			System.out.printf("%d ", origin[i]);
		}
		System.out.printf("/ %d\n", origin.hashCode());
		
		System.out.print("얕은 복사 배열 : ");
		for(int i=0; i<copy.length; i++) {
			System.out.printf("%d ", copy[i]);
		}
		System.out.printf("/ %d\n", copy.hashCode());
		
		copy[2] = 99;
		
		System.out.println("\n==========[copy[2] 값 변경]==========");
		
		System.out.print("원본 배열 : ");
		for(int i=0; i<origin.length; i++) {
			System.out.printf("%d ", origin[i]);
		}
		System.out.printf("/ %d\n", origin.hashCode());
		
		
		System.out.print("얕은 복사 배열 : ");
		for(int i=0; i<copy.length; i++) {
			System.out.printf("%d ", copy[i]);
		}
		System.out.printf("/ %d\n", copy.hashCode());
	}
	
	public void method2() {
		int origin[] = {1, 2, 3, 4, 5};
		int copy[] = new int[5];
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("==========[for문을 이용한 깊은 복사]==========");
		System.out.print("원본 배열 : ");
		for(int i=0; i<origin.length; i++) {
			System.out.printf("%d ", origin[i]);
		}
		System.out.printf("/ %d\n", origin.hashCode());
		
		
		System.out.print("깊은 복사 배열 : ");
		for(int i=0; i<copy.length; i++) {
			System.out.printf("%d ", copy[i]);
		}
		System.out.printf("/ %d\n", copy.hashCode());
	}
	
	public void method3() {
		int origin[] = {1, 2, 3, 4, 5};
		int copy[] = new int[10];
		
		// arraycopy(원본배열, 복사를 시작할 인덱스, 복사배열, 시작 인덱스, 복사개수)
		System.arraycopy(origin, 0, copy, 0, 5);
//		System.arraycopy(origin, 0, copy, 2, 5);
//		System.arraycopy(origin, 0, copy, 1, 3);
//		System.arraycopy(origin, 2, copy, 1, 3);
		
		
		System.out.println("========[arraycopy 이용한 깊은 복사]========");
		
		System.out.print("원본 배열 : ");
		System.out.print(Arrays.toString(origin));
		System.out.printf(" / %d\n", origin.hashCode());
		
		System.out.print("깊은 복사 배열 : ");
		System.out.print(Arrays.toString(copy));
		System.out.printf(" / %d\n", copy.hashCode());
	}
	
	public void method4() {
		int origin[] = {1, 2, 3, 4, 5};
		int copy[] = new int[10];
		
		// copyOf(원본배열, 복사개수)
		// copyOf는 설정한 복사개수에 따라 크기가 결정됨
		copy = Arrays.copyOf(origin, 5);
		
		
		System.out.println("=========[copyOf 이용한 깊은 복사]=========");
		
		System.out.print("원본 배열 : ");
		System.out.print(Arrays.toString(origin));
		System.out.printf(" / %d\n", origin.hashCode());
		
		System.out.print("깊은 복사 배열 : ");
		System.out.print(Arrays.toString(copy));
		System.out.printf(" / %d\n", copy.hashCode());
	}
	
	public void method5() {
		int origin[] = {1, 2, 3, 4, 5};
		int copy[] = new int[10];
		
		// 원본 배열과 동일하게 복사(크기, 값)
		copy = origin.clone();
		
		System.out.println("=========[copyOf 이용한 깊은 복사]=========");
		
		System.out.print("원본 배열 : ");
		System.out.print(Arrays.toString(origin));
		System.out.printf(" / %d\n", origin.hashCode());
		
		System.out.print("깊은 복사 배열 : ");
		System.out.print(Arrays.toString(copy));
		System.out.printf(" / %d\n", copy.hashCode());
	}
	
}
