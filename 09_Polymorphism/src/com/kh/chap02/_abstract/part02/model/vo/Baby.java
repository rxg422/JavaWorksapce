package com.kh.chap02._abstract.part02.model.vo;

public class Baby extends Person implements Basic{

	public Baby() {
		// TODO Auto-generated constructor stub
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public void eat() {
		setWeight(getWeight()+3);
		setHealth(getHealth()+1);
	}

	@Override
	public void sleep() {
		setHealth(getHealth()+3);
	}

	@Override
	public String toString() {
		return "Baby [toString()=" + super.toString() + "]";
	}
	
}
