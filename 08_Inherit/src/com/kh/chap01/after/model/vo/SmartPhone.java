package com.kh.chap01.after.model.vo;

public class SmartPhone extends Product {
	
	private String moblieAgency;
	
	public SmartPhone() {
		
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String moblieAgency) {
		super(brand, pCode, pName, price);
		this.moblieAgency = moblieAgency;
	}

	@Override
	public String information() {
		return super.information() + ", " + moblieAgency;
	}
	
}
