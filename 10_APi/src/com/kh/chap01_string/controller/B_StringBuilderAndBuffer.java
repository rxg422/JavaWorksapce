package com.kh.chap01_string.controller;

public class B_StringBuilderAndBuffer {
	
	public void method1() {
		String str = "Hello";
		str += "World";
		
		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append("world");
		
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.append("World");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println("Str length : " + sb1.length());
		System.out.println("last 'o' index : " + sb1.lastIndexOf("o"));
		System.out.println("del All str : " + sb1.delete(0, sb1.length() - 3));
		System.out.println("del last char : " + sb1.deleteCharAt(1));
	}
	
}
