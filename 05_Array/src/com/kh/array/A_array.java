package com.kh.array;

import java.util.Arrays;
import java.util.Collections;

public class A_array {
	
	public void method1() {
		// 배열 선언 및 할당
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
		// 주소값이 출력됨
		System.out.println(arr);
	}
	
	public void method2() {
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int arr3[] = arr2;
		
		// 주소 값을 10진수 형태로 변환
		System.out.println("arr1의 hashcode: " + arr1.hashCode());
		System.out.println("arr2의 hashcode: " + arr2.hashCode());
		System.out.println("arr2의 hashcode: " + arr3.hashCode());
		
		System.out.println("arr1과 arr2 비교: " + (arr1 == arr2));
		System.out.println("arr2과 arr3 비교: " + (arr2 == arr3));
	}
	
	public void method3() {
		int arr1[] = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i;
			System.out.printf("%d ", arr1[i]);
		}
		
		System.out.println();
	}
	
	public void method4() {
		int arr[] = null;
		
		// null은 모든 참조형 자료형의 기본값
	}
	
	public void method5() {
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1) * 2;
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.printf("%d ", arr[i]);
		}
	}
	
	public void method6() {
		// 배열 선언,할당 시 초기화
		int arr1[] = new int[] {1, 2, 3, 4};
		int arr2[] = {1, 2, 3, 4};
		
	}
	
	public void method7() {
		String str = "merry";
		
		char chArr[] = str.toCharArray();
		char chArr2[] = new char[chArr.length];
		
		
		
		
		for(int i=0; i<chArr.length; i++) {
			chArr2[i] = chArr[i];
		}
		
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr2);
	}
	
	
}
