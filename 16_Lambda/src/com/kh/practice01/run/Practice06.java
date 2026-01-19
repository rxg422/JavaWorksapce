package com.kh.practice01.run;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice06 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("jin", "suga", "rm", "jhope", "v");
		
		
		Comparator<String> comp = getComparator("length");
		names.sort(comp);
		System.out.println(names);
		
		comp = getComparator("reverse");
		names.sort(comp);
		System.out.println(names);
	}
	
	public static Comparator<String> getComparator(String mode) {
		Comparator<String> comp = null;
		
		switch(mode) {
		case "length" :
			comp = (o1, o2) -> o1.length() - o2.length();
			break;
		case "reverse" :
			comp = (o1, o2) -> o2.compareTo(o1);
			break;
		}
		
		return comp;
		
	}
	
}
