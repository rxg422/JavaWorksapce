package com.kh.chap02.override.model.vo;

public class Book {
	
	protected String title, author;
	protected int price;
	
	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

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

	
	@Override // 어노테이션. 생략이 가능하지만 오버라이드된 메서드임을 표시하고 오류를 확인하기 위해 사용
	public String toString() {
		return title + ", " + author + ", " + price;
	}
	
}
