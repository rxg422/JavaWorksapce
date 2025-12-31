package com.kh.chap01.oneVsMany.model.vo;

public class Book {

	// 맴버 변수
	private String title, author, publisher;
	private int price;
	
	// 생성자 함수
	public Book() {
		
	}
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	// getter/setter 메서드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 메서드
	public String information() {
		return "title: " + title + ", author: " + author + ", price: " + price + ", publisher: " + publisher;
	}
	
}
