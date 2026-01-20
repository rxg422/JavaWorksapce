package com.kh.chap01_constant.model.vo;

public class Car {

	private String name;
	private int carColor;
	
	public static final int BLACK = 0;
	public static final int RED = 1;
	public static final int BLUE = 2;
	
	public static final int GREEN = 3;
	public static final int YELLOW = 3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCarColor() {
		return carColor;
	}
	public void setCarColor(int carColor) {
		this.carColor = carColor;
	}
	public void setColor(Color c) {
		this.carColor = c.getColor();
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", carColor=" + carColor + "]";
	}
	
}
