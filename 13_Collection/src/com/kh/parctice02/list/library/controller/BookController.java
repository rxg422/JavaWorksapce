package com.kh.parctice02.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.kh.parctice02.list.library.model.vo.Book;

public class BookController {

	private List<Book> list = new ArrayList<>();
	
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000)); 
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000)); 
		list.add(new Book("대화의 기술", "강보람", "인문", 17500)); 
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
//		for(Book b : list) {
//			if(list.get(list.indexOf(b)).equals(bk)) {
//				System.out.println("이미 존재하는 서적입니다.");
//				return;
//			}
//		}
		
		list.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>) list;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
//		Book b;
//		
//		for(int i=0; i < list.size(); i++) {
//			b = list.get(i);
//			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
//				return list.remove(i);
//			}
//		}
		
//		Iterator<Book> iter = list.iterator();
//		
//		while(iter.hasNext()) {
//			Book b = iter.next();
//			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
//				return list.remove(list.indexOf(b));
//			}
//		}
		
		for(Book b : list) {
			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				return list.remove(list.indexOf(b));
			}
		}
		return null;
	}
	
	public int ascBook() {
		try {
			Collections.sort(list);
		} 
		catch (Exception e) {
			return 0;
		}
		
		return 1;
	}
	
}
