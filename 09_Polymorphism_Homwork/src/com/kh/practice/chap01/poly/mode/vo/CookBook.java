package com.kh.practice.chap01.poly.mode.vo;

public class CookBook extends Book {

	private boolean coupon;
	
	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	

	public boolean isCoupon() {
		return coupon;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + coupon;
	}
	
}
