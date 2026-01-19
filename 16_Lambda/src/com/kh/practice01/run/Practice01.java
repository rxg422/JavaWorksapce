package com.kh.practice01.run;

public class Practice01 {

	public static void main(String[] args) {
		String arr[] = {"aaa", "bbb", "abb", "wow", "aa", "ab"};
		printString(arr, str -> str.contains("a"));
		System.out.println();
		printString(arr, str -> str.startsWith("w"));
		System.out.println();
		printString(arr, str -> str.length()%2==0 && str.contains("a"));	
	}
	
	public static void printString(String arr[], StringChecker checker) {
		for(String str : arr) {
			if(checker.check(str)) {
				System.out.println(str);
			}
		}
	}
	
	@FunctionalInterface
	interface StringChecker {
		boolean check(String str);
	}
	
}
