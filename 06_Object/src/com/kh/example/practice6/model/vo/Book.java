package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title, publisher, author;
	private int price;
	private double discountRate;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void information() {
		System.out.printf("%s / %s / %s / %d / %.2f\n", title, publisher, author, price, discountRate);
	}
	
}
