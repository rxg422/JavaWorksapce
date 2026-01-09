package com.kh.practice3.book.controller;


import java.io.File;
import java.io.IOException;

import com.kh.practice3.book.model.dao.BookDao;
import com.kh.practice3.book.model.vo.Book;

public class BookController {

	private BookDao bd = new BookDao();
	
	public void makeFile() {
		File f = new File("book.txt");
		if(!f.isFile()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(Book bArr[]) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
