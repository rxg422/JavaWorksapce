package com.kh.chap01.before.model.vo;

public class SmartPhone {
	
	private String brand, pCode, pName, mobileAgency;
	private int price;
	
	public SmartPhone() {
		// TODO Auto-generated method stub

	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getAgency() {
		return mobileAgency;
	}

	public void setAgency(String agency) {
		this.mobileAgency = agency;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", " + mobileAgency;
	}
	
}
