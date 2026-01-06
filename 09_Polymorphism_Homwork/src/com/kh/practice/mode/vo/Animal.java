package com.kh.practice.mode.vo;

public abstract class Animal {

	private String name;
	private String kinds;
	
	protected Animal() {
		// TODO Auto-generated constructor stub
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", kinds=" + kinds + "]";
	}
	
	public abstract void speak();
	
}
