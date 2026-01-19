package com.kh.practice01.run;

public class Practice03 {

	public static void main(String[] args) {
		Myfunction<String, String> first = str -> str.toUpperCase();
		Myfunction<String, Boolean> second = str -> str.length() >= 5;
		Myfunction<String, String> third = str -> {
			String s = "";
			for(char c : str.toCharArray()) {
				s += c + "-";
			}
			
			return s.substring(0, s.length()-1);
		};
		
		System.out.println(first.apply("hello"));
		System.out.println(second.apply("hi"));
		System.out.println(third.apply("holy"));
	}
	
	@FunctionalInterface
	interface Myfunction<V, B> {
		B apply(V v);
	}
	
}
