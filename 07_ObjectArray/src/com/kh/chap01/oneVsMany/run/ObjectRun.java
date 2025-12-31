package com.kh.chap01.oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book bArr[] = new Book[3];
		Book b1 = new Book();
		Book b2 = new Book("d", "e" , 17000, "f");
		Book b3 = new Book("g", "h" , 17000, "i");
		
		String searchTitle;
		
		bArr[0] = b1;
		bArr[1] = b2;
		bArr[2] = b3;
		
		b1.setTitle("a");
		b1.setAuthor("b");
		b1.setPrice(13000);
		b1.setPublisher("c");
		
		System.out.print("Search : ");
		searchTitle = sc.nextLine();
		
		for(int i=0; i<bArr.length; i++) {
			if(bArr[i].getTitle().equals(searchTitle)) {
				System.out.printf("b%d = %s\n", i+1, bArr[i].information());
			}
		}
		
		sc.close();
	}

}
