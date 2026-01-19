package com.kh.practice01.run;

import java.util.function.BiFunction;

public class Practice05 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> op = getOperator("+");
		System.out.println(op.apply(10, 5));
		
		op = getOperator("*");
		System.out.println(op.apply(10, 20));
	}
	
	public static BiFunction<Integer, Integer, Integer> getOperator(String type) {
		BiFunction<Integer, Integer, Integer> bi = null;
		
		switch(type) {
		case "+" :
			bi = (a, b) -> a + b;
			break;
		case "-" :
			bi = (a, b) -> a - b;
			break;
		case "*" :
			bi = (a, b) -> a * b;
			break;
		case "/" :
			bi = (a, b) -> a / b;
			break;
		case "%" :
			bi = (a, b) -> a % b;
		}
		
		return bi;
		
	}
	
}
