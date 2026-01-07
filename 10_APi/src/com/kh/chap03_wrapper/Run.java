package com.kh.chap03_wrapper;

public class Run {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.compareTo(i2)); // -1:i1<i2 / 0:i1==i2 / 1:i1>i2
		
		// UnBoxing : Wrapper → 기본 자료형
		int num3 = i1;
		int num4 = i2;
		
		System.out.println("=====================");
		
		String str1 = "10";
		String str2 = "15.3";
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i);
		System.out.println(d);
		
		System.out.println("=====================");
		String strI = String.valueOf(i);
		String strI2 = i + "";
	}
	
}
