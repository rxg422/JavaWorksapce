package com.kh.example.practice3.model.vo;

public class Circle {
	
	private static final double PI = 3.14;
	private static int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.printf("원의 둘레 : %.2f\n", 2 * PI * radius);
	}
	
	public void getSizeOfCircle() {
		System.out.printf("원의 넓이 : %.2f\n", PI * radius * radius);
	}
}
