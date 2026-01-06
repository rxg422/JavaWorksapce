package com.kh.chap02._abstract.part02.run;

import com.kh.chap02._abstract.part02.model.vo.*;

public class Run {

	public static void main(String[] args) {
//		Person p1 = new Mother("명지원", 50, 100, "출산");
//		Person p2 = new Baby("김지원", 4, 80);
		Basic b1 = new Mother("명지원", 50, 100, "출산");
		Basic b2 = new Baby("김지원", 4, 80);
		
//		p1.eat();
//		p2.eat();
//		p1.sleep();
//		p2.sleep();
//		
//		System.out.println("=====");
//		
//		System.out.println(p1);
//		System.out.println(p2);
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
