package com.kh.chap01_string.controller;

public class A_StringPool {

	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public void method2() {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		String str3 = "hello";
		String str4 ="Wolrd";	
	}
	
	public void method3() {
		String str = "Hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
		
		String newStr = "Hello";
		System.out.println(System.identityHashCode(newStr));
	}
	
}
