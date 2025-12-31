package com.kh.chap01.after.model.vo;

public class TV extends Product {
	
	private int inch;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}

	public TV(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	@Override
	public String information() {
		return super.information() + ", " + inch;
	}
	
}
