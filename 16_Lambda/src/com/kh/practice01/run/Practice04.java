package com.kh.practice01.run;

public class Practice04 {

	public static void main(String[] args) {
		MyFunction2<String, Integer> printer = (name, score) -> 
		System.out.println(name + "님의 점수는 " + (score>=90 ? "A" : score>=80 ? "B" : score>=70 ? "C" : "D") + "학점(" + score + ")입니다.");
		
		printer.accept("ㅁㅁ", 58);
		printer.accept("aa", 90);
	}
	
	@FunctionalInterface
	interface MyFunction2<K, A> {
		void accept(K k, A a);
	}
	
}
