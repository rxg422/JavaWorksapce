package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	public static final double PI = 3.14;
	private Circle c = new Circle();
	
	public String clacArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "x좌표: " + x + " y좌표: " + y + " 넓이: " + (PI * radius * radius);
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		
		return "x좌표: " + x + " y좌표: " + y + " 둘레: " + (2 * PI * radius);
	}
	
}
