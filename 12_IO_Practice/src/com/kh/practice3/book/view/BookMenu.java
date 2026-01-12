package com.kh.practice3.book.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice3.book.controller.BookController;
import com.kh.practice3.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book bArr[] = null;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu() {
		int menu;
		while(true) {
			System.out.print("===== Main Menu =====\n1. 도서 추가 저장\n2. 저장 도서 출력\n9. 프로그램 끝내기\n메뉴 번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				fileSave();
				break;
			case 2 :
				fileRead();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		sc.nextLine();
		
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		
		System.out.println("저자 명 : ");
		String author = sc.nextLine();
		
		System.out.println("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.println("출판 날짜(yyyy-mm-dd) : ");
		String day[] = sc.next().split("-");
		
		System.out.println("할인율 : ");
		double discount = sc.nextDouble();
		
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		int date = Integer.parseInt(day[2]);
		
		Calendar c = new GregorianCalendar(year, month, date);
//		Calendar c = Calendar.getInstance();
//		c.set(year, month, date);
		
		int idx = 0;
		
		for(Book b : bArr) {
			if(b==null) {
				break;
			}
			idx++;
		}
		
		bArr[idx++] = new Book(title, author, price, c, discount);
		
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
		for(Book b : bc.fileRead()) {
			if(b==null) {
				return;
			}
			System.out.println(b);
		}
		
		
	}
	
}
