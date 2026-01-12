package com.kh.chap03_generic.run;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// 제네릭 사용 전 코딩 방식
		// 컬렉션 사용 시 Object 객체로 저장해야 했으며 강제 형변환이 강제되었음.
		// 때문에 잘못된 타입으로 인한 오류가 많았음.
		List list = new ArrayList<>();
		
		list.add("h1");
		list.add(1);
		list.add(3.14);
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		
		
	}
	
}
