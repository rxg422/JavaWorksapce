package com.kh.practice01.run;

public class Practice02 {

	public static void main(String[] args) {
		Calculator<Integer> adder = (a, b) -> a + b;
		System.out.println(adder.operator(3, 4));
		Calculator<Integer> findMax = (a, b) -> Math.max(a, b);
		System.out.println(findMax.operator(12, 42));
		Calculator<String> combiner = (a, b) -> a + "-" + b;
		System.out.println(combiner.operator("hello", "world"));
	}
	
	@FunctionalInterface
	interface Calculator<V> {
		V operator(V v1, V v2);
	}
	
}
