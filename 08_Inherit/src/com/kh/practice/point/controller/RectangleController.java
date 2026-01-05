package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String clacArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "x좌표: " + x + " y좌표: " + y + " 둘레: " + (height * width);
	}
	
	public String clacPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "x좌표: " + x + " y좌표: " + y + " 넓이: " + (2 * (height + width));
	}
	
}
