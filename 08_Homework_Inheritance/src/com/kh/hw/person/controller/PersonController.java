package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student s[] = new Student[3];
	private Employee e[] = new Employee[10];
	public int sCnt=0, eCnt=0;
	
	public int[] personCount() {
		int arr[] = {sCnt, eCnt};
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student student = new Student(name, age, height, weight, grade, major);
		s[sCnt] = student;
		sCnt++;
	}
	
	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salaty, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	
}
