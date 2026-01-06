package com.kh.chap02._abstract.part02.model.vo;

public class Mother extends Person implements Basic{

	private String babyBirth; // 자식 여부 : 출산, 입양, 없음
	
	public Mother() {
		// TODO Auto-generated constructor stub
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public void eat() {
		setWeight(getWeight()+10);
		setHealth(getHealth()-10);
	}

	@Override
	public void sleep() {
		setHealth(getHealth()+10);
	}

	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + ", toString()=" + super.toString() + "]";
	}

}
