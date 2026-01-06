package com.kh.practice.chap01.poly.mode.vo;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title + " / " + author + " / " + publisher;
	}
	
}
