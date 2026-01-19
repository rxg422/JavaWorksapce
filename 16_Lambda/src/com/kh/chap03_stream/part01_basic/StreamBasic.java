package com.kh.chap03_stream.part01_basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		IntStream intStream = Arrays.stream(arr);
		
		String sArr[] = {"아자스", "야르", "무지컬"};
		Stream<String> stream = Arrays.stream(sArr);
		
		ArrayList<Integer> list = new ArrayList<>();
		Stream<Integer> arrayStream = list.stream();
		
		Set<Integer> set = new HashSet<>();
		Stream<Integer> setStream = set.stream();
		
		HashMap<String, Integer> map = new HashMap<>();
		Stream<String> mapStream = map.keySet().stream();
		
		// Stream 클래스를 통한 생성
		Stream<String> empty = Stream.empty();
		Stream<String> sStream = Stream.<String>builder().add("A").add("B").add("C").build();
		Stream<String> oStream = Stream.of("a", "b", "c");
		Stream<Integer> iStream = Stream.generate(() -> 1).limit(100); // 내부에 100개의 1 생성
		Stream<Integer> iStream2 = Stream.iterate(1, i -> i+1).limit(100); // 1~100 생성
		IntStream iStream3 = IntStream.range(1, 5); // {1, 2, 3, 4}
		IntStream iStream4 = IntStream.rangeClosed(1, 5); // 1~5;
		
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			Stream<String> lines = br.lines();
			lines.forEach(str -> System.out.println(str));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		stream.forEach(str -> System.out.println(str));
		
		IntStream iStream5 = intStream.filter(num -> num%2==0).peek(num -> System.out.println(num)).filter(num -> num%4==0);
		
		System.out.println();
		int sum2 = iStream5.sum();
		System.out.println();
		System.out.println(sum2);
		
		IntStream streamTest = intStream.filter(num -> num%2==0).peek(num -> System.out.println(num)).filter(num -> num%4==0).peek(num -> System.out.println(num));
		int sumTest = streamTest.sum();
		System.out.println(sumTest);
	}
	
}
