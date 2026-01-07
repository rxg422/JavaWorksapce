package com.kh.chap02_string.controller;

public class D_StringMethod {
	
	public void method1() {
		String str1 = "Hello World";
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(2, 8));
		System.out.println(str1.replace("Hello", "Hi"));
		
		String str3 = " Java is fun ";
		System.out.println(str3.trim());
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		char arr[] = str1.toCharArray();
		
		System.out.println(String.valueOf(arr));
	}
	
}
