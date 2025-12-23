package com.kh.array;

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
		int num=10;
		int arr[] = new int[5];
		int arr2[] = arr;
		// 주소 값을 10진수 형태로 변환
		System.out.println("arr의 hashcode: " + arr.hashCode());
		System.out.println("arr2의 hashcode: " + arr2.hashCode());
	}
	
}
