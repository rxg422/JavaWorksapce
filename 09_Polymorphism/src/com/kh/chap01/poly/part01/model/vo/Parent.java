package com.kh.chap01.poly.part01.model.vo;

public class Parent {

	private int x, y;
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("부모클래스의 메서드");
	}
	
	public void print() {
		System.out.println("Parent Method");
	}
	
}
