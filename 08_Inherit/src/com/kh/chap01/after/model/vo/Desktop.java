package com.kh.chap01.after.model.vo;

public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	@Override
	public String information() {
		return super.information() + ", " + allInOne;
	}
	
}
