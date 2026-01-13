package com.kh.chap03_generic.model.vo;

public class Child1 extends Parent{

	@Override
	public void doPrint() {
		System.out.println("Child1");
	}

	@Override
	public String toString() {
		return "Child1 Class [" + super.toString() + "]";
	}
	
}
