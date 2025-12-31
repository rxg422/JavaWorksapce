package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	private Student stdArr[] = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		Student std1 = new Student("김길동", "자바", 100);
		Student std2 = new Student("박길동", "디비", 50);
		Student std3 = new Student("이길동", "화면", 85);
		Student std4 = new Student("정길동", "서버", 60);
		Student std5 = new Student("홍길동", "자바", 20);
		
		stdArr[0] = std1;
		stdArr[1] = std2;
		stdArr[2] = std3;
		stdArr[3] = std4;
		stdArr[4] = std5;
	}
	
	public Student[] printStudent() {
		return stdArr;
	}
	
	public int sumScore() {
		int sum =0;
		
		for(Student std : stdArr) {
			sum += std.getScore();
		}
		
		return sum;
	}
	
	public double[] avgScore() {
		double avg[] = new double[2];
		
		avg[0] = sumScore();
		avg[1] = sumScore() / stdArr.length;
		
		return avg;
	}
	
}
