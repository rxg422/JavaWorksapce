package com.kh.chap01.abstraction.model.vo;

public class Student {
	
	public String name;
	public int age;
	public double height;

	public void study() {
		System.out.printf("%s학생 공부 중...\n", name);
	}
}

