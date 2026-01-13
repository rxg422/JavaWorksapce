package com.kh.chap03_generic.run;

import com.kh.chap03_generic.model.vo.Child1;
import com.kh.chap03_generic.model.vo.Child2;
import com.kh.chap03_generic.model.vo.GenericExtends;
import com.kh.chap03_generic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		// 제네릭 사용 전 코딩 방식
		// 컬렉션 사용 시 Object 객체로 저장해야 했으며 강제 형변환이 강제되었음.
		// 때문에 잘못된 타입으로 인한 오류가 많았음.
//		List list = new ArrayList<>();
//		
//		list.add("h1");
//		list.add(1);
//		list.add(3.14);
//		
//		for(Object o : list) {
//			System.out.println(o);
//		}
		
//		Generic<Integer, String> g1 = new Generic<Integer, String>();
//		
//		g1.setT(422);
//		g1.setG("Hi");
//		
//		System.out.println(g1.getT());
//		System.out.println(g1.getG());
//		
//		Generic.printTest(1234);
//		Generic.printTest("hi");
		
		GenericExtends<Parent> parent = new GenericExtends<>();
		GenericExtends<Child1> child1 = new GenericExtends<>();
		GenericExtends<Child2> child2 = new GenericExtends<>();
		
		parent.setType(new Parent());
		
		// 자료형이 정해지지 않음
		GenericExtends<? extends Parent> unkown = new GenericExtends<>();
		Parent p = unkown.getType();

		GenericExtends<? super Parent> unkown2 = new GenericExtends<>();
		unkown2.setType(new Parent());
		unkown2.setType(new Child1());
		unkown2.setType(new Child2());
	}
	
}
