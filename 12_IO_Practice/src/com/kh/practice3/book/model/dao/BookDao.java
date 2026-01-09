package com.kh.practice3.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice3.book.model.vo.Book;

public class BookDao {
	
	private Book bArr[] = new Book[10];
	
	public void fileSave(Book bArr[]) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt", true))) {
			for(Book b : bArr) {
				if(b!=null) {
					oos.writeObject(b);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		 // 객체를 저장하는 스트림인 ObjectOutputStream을 가지고 book.txt에  
		// 매개변수로 받은 bArr을 저장, 단 null이 아닌 것만 저장함 
	}
	
	public Book[] fileRead() {
		Book b[] = new Book[10];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"))) {
			int i=0;
			while(true) {
				b[i++] = (Book)ois.readObject();
			}
			
//			for(int i=0; i<10; i++) {
//				b[i] = (Book)ois.readObject();
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			return bArr;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("dd");
		}
		
		return bArr;
	}
	
}
