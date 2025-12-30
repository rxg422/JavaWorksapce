package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName, brand;
	private int price;
	
	public Product() {
		
	}
	
	public void information() {
		System.out.printf("%s / %d / %s", pName, price, brand);
	}
}
