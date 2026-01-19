package com.kh.chap03_stream.part02_methods;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {
	
	public static void main(String[] args) {
		// 중간처리 메서드
		List<Integer> list = Arrays.asList(5, 1, 2, 3, 5, 2, 3, 4, 5, 9);
		Stream<Integer> stream = list.stream();
		stream.distinct().filter(i -> i%2==1).forEach(System.out::println);
		
		String names[] = {"강감찬", "강원래", "홍길동", "강형욱", "초난감"};
		Arrays.stream(names).filter(name -> name.startsWith("강")).forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		list2.stream().map(i -> i + "!").forEach(System.out::println);
		
		List<Integer> newList = list2.stream().map(i -> i * 100).collect(Collectors.toList());
		System.out.println(newList);
		
		System.out.println();
		Arrays.stream(names).mapToInt(name -> name.length()).forEach(System.out::println);;
		
		List<Integer> list4 = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6);
		Set<Integer> set = list4.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		Map<Integer, String> result2 = list4.stream().distinct().collect(Collectors.toMap(i->i, i->"#"+i+"#"));
		System.out.println(result2);
		
		int sum = IntStream.rangeClosed(1, 100).sum();
		System.out.println(sum);
		
		double avg = DoubleStream.iterate(1, i->i+1).limit(100).average().getAsDouble();
		System.out.println(avg);
		
		IntSummaryStatistics summary = IntStream.of(32, 50, 20, 12, 94, 48, 7, 72).summaryStatistics();
		System.out.println(summary);
		
		int result3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().reduce(0, (sum2, n) -> {
			System.out.println("sum2 : " + sum2);
			return sum2 + n;
		});
		
		System.out.println(result3);
		
		int result4 = Arrays.asList(1,23,4,5,6,5,27,5,3,2,6,33).stream().reduce(0, (max, n) -> {
			if(max<n) {
				max = n;
			}
			return max;
		});
		
		System.out.println(result4);
		
		
		
		class Member{
			String name;
			int age;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public Member(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			@Override
			public String toString() {
				return "Member [name=" + name + ", age=" + age + "]";
			}
		}
		
		List<Member> arr = Arrays.asList(
				new Member("홍길동", 35),
				new Member("신사임당", 40),
				new Member("세종", 45),
				new Member("홍난파", 80),				
				new Member("전달력", 69)			
		);
		Member mem = arr.stream().reduce((m1, m2) -> {
			return m1 = m1==null||m1.age<m2.age ? m2 : m1;
		}).get();
		System.out.println(mem.name + "/" + mem.age + "세");
		
		int ageSum = arr.stream().map(m -> m.age).reduce(0, (sum3, age) -> sum3 + age);
		System.out.println(ageSum);
		
		boolean bool = Arrays.asList("1", "2b", "c", "d4", "5").stream().anyMatch(str -> str.startsWith("2"));
		System.out.println(bool);
		
		bool = Arrays.asList("홍길동", "123", "가나다").stream().noneMatch(str -> str.length()>4);
		System.out.println(bool);
		
		bool = Arrays.asList("홍길동", "123", "가나다").stream().allMatch(str -> str.length()<=3);
		System.out.println(bool);
		
		String result5 = Arrays.asList("홍길동", "111", "11111", "1가나다").stream().filter(s -> s.startsWith("1")).findFirst().get();
		System.out.println(result5);
		
		String string = Arrays.asList("홍길동2", "123", "가나다").stream().filter(str -> str.length()<=4).findAny().get();
		System.out.println(string);
	}
	
}
