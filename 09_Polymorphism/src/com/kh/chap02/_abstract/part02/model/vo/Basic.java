package com.kh.chap02._abstract.part02.model.vo;

public interface Basic {
	
	int num = 10;
	
	default void breathing() {
		System.out.println("숨쉬기");
	}
	
	static void thinking() {
		System.out.println("생각하기");
	}

}
