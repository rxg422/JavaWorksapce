package com.kh.chap02_lambda.part04_methodRef;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		Consumer<String> print = System.out::println;
		print.accept("hello");
		
		Function<String, Integer> strLength = String::length;
		System.out.println(strLength.apply("로프반동 크로스라인"));
		
		BiFunction<String, String, Boolean> strEquals = String::equals;
		System.out.println(strEquals.apply("캠히나", "버진석"));
	
		String title = "소나기";
		Predicate<String> equalsToTitle = title::equals;
		System.out.println(equalsToTitle.test("소나기"));
		
		class Person {
			private String name;
			private int age;
			
			public Person() {
				
			}
			
			public Person(String name) {
				
			}
			
			public Person(String name, int age) {
				
			}
		}
		Supplier<Person> personSupplier = Person::new;
		
		BiFunction<String, Integer, Person> personFunction = Person::new; 
	}
	
}
