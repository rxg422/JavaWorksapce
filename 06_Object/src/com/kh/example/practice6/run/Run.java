package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("AI", "Sony", "John");
		Book b3 = new Book("IT", "Marvel", "Wick", 15000, 0.2);
		
		b1.information();
		b2.information();
		b3.information();
	}

}
