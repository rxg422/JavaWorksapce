package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap02_set.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Set<String> hs1 = new HashSet<>();
		hs1.add("1");
		hs1.add("1");
		hs1.add("5");
		hs1.add("2");
		
		System.out.println(hs1);
		System.out.println(hs1.size());
		
		hs1.remove("1");
		System.out.println(hs1);
		
		System.out.println("=========================");
		Set<Student> hs2 = new HashSet<>();
		hs2.add(new Student("공유", 40, 100));
		hs2.add(new Student("공유", 40, 100));
		hs2.add(new Student("길동", 45, 90));
		hs2.add(new Student("둘리", 7, 65));
		
		
//		for(Student s : hs2) {
//			System.out.println(s);
//		}
		
		Iterator<Student> iter = hs2.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		List<Student> list = new ArrayList<>(hs2);
		System.out.println(list);
		
		List<Student> list2 = new ArrayList<>();
		list2.addAll(hs2);
		System.out.println(list2);
		
		Set<Student> hsl1 = new HashSet<Student>(list);
		Set<Student> hsl2 = new HashSet<Student>();
		hsl2.addAll(list2);
		
		System.out.println("===== LinkedHashSet =====");
		
		Set<Integer> set1 = new LinkedHashSet<>();
		
		set1.add(34);
		set1.add(45);
		set1.add(1);
		set1.add(92);
		set1.add(22);
		
		System.out.println(set1);
		
		System.out.println("======== TreeSet ========");
		
		Set<Integer> set2 = new TreeSet<Integer>(set1);
		System.out.println(set2);
		
		Set<Integer> set3 = new TreeSet<Integer>(Collections.reverseOrder());
		set3.addAll(set2);
		System.out.println(set3);
	}

}
