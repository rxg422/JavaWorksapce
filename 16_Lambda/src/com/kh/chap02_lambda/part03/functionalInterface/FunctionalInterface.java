package com.kh.chap02_lambda.part03.functionalInterface;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(new Date());
			}
		};
		
		r.run();
		
		Supplier<Long> supplier = () -> new Date().getTime();
		System.out.println(supplier.get());
		
		Consumer<String> consumer = name -> System.out.println(name);
		consumer.accept("윤진석");
		
		Function<String, Integer> function = str -> str.length();
		System.out.println(function.apply("hello"));
		
		Predicate<Integer> predicate = num -> num % 2 == 0;
		System.out.println(predicate.test(422));
	}
	
}
