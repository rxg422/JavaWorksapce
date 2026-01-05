package com.kh.chap01.poly.part01.model.vo;

public class Child1 extends Parent{
	
	private int z;
	
	public Child1() {
		// TODO Auto-generated constructor stub
	}

	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("Child1 메서드");
	}
	
	public void print() {
		System.out.println("Overriding Child Method 1");
	}
	
}
