package com.kh.chap03_generic.model.vo;

public class Child2 extends Parent{

	@Override
	public void doPrint() {
		System.out.println("Child2");
	}

	@Override
	public String toString() {
		return "Child2 Class [" + super.toString() + "]";
	}

}
