package com.kh.chap01.poly.part01.run;

import com.kh.chap01.poly.part01.model.vo.*;

public class Run {

	public static void main(String[] args) {
		System.out.println("부모타입 참조변수로 부모 객체 다루기");
		Parent p1 = new Parent();
		p1.printParent();
		
		System.out.println("자식타입 참조변수로 자식 객체 다루기");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		
		System.out.println("부모타입 참조변수로 자식 객체 다루기");
		Parent p2 = new Child1();
		p2.printParent();
		((Child1)p2).printChild1();
		
		// 다형성 적용 전
		Child1 c1Arr[] = new Child1[2];
		c1Arr[0] = new Child1(1, 2, 4);
		c1Arr[1] = new Child1(2, 6, 4);
		
		Child2 c2Arr[] = new Child2[2];
		c2Arr[0] = new Child2(1, 5);
		c2Arr[1] = new Child2(1 ,2);
		
		// 다용성 적용
		Parent pArr[] = new Parent[4];
		pArr[0] = new Child1(1, 2, 4);
		pArr[1] = new Child1(2, 6, 4);
		pArr[2] = new Child2(1, 5);
		pArr[3] = new Child2(1 ,2);
		
		pArr[0].print();
	}

}
