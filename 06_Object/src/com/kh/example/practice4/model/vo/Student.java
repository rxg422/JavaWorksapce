package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {
		grade = 3;
		classroom = 8;
		name = "Robert";
		height = 183.2;
		gender = 'M';
	}
	
	public void information() {
		System.out.printf("%d / %d / %s / %.1f / %c", grade, classroom, name, height, gender);
	}
}
