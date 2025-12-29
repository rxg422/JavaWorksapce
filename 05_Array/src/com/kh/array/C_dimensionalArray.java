package com.kh.array;

import java.util.Arrays;

public class C_dimensionalArray {

	public void method1() {
		int arr[][] = new int[3][5];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method2() {
//		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int arr[][] = new int[3][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (j+1) + (arr[i].length*i);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	// 가변배열
	public void method3() {
		// 가변배열 선언
		int arr[][] = new int[3][];
		int n = 0;
		
		arr[0] = new int [2];
		arr[1] = new int [3];
		arr[2] = new int [1];
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ++n;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public void method4() {
		char arr[][] = new char[3][];
		char ch = 'a'; // 97
		
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
}
