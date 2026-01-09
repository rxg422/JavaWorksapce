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
	private int idx = 0;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
		// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출 
		  // 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
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
		String date[] = sc.next().split("-");
		
		
		System.out.println("할인율 : ");
		double discount = sc.nextDouble();
		
		int year = Integer.valueOf(date[0]);
		int month = Integer.valueOf(date[1]);
		int day = Integer.valueOf(date[2]);
		
		Calendar c = new GregorianCalendar(year, month, day);
		
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
