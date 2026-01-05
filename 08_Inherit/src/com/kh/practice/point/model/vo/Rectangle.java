package com.kh.practice.point.model.vo;

public class Rectangle extends Point{

	private int height, width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int height, int width) {
		super(x, y);
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
