package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "김태환";
		student1.age = 24;
		student1.height = 175;
		
		student2.name = "김지원";
		student2.age = 22;
		student2.height = 180.3;
		
		student1.study();
		student2.study();
	}

}
