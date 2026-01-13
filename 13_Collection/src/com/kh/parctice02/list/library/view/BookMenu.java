package com.kh.parctice02.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.parctice02.list.library.controller.BookController;
import com.kh.parctice02.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		
		int menu;
		while(true) {
			System.out.print("******* 메인 메뉴 *******\n1. 새 도서 추가\n2. 도서 전체 조회\n3. 도서 검색 조회\n4. 도서 삭제\n5. 도서 명 오름차순 정렬\n9. 종료\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				insertBook();
				break;
			case 2 :
				selectList();
				break;
			case 3 :
				searchBook();
				break;
			case 4 :
				deleteBook();
				break;
			case 5 :
				ascBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다");
				return;
			default :
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertBook() {
		String title, author;
		int category, price;
		
		String cArr[] = {"인문", "자연과학", "의료", "기타"};
		
		sc.nextLine();
		
		System.out.print("도서명 : ");
		title = sc.nextLine();
		System.out.print("작가 : ");
		author = sc.nextLine();
		System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		category = sc.nextInt();
		System.out.print("가격 : ");
		price = sc.nextInt();
		
		bc.insertBook(new Book(title, author, cArr[category-1], price));
	}
	
	public void selectList() {
		ArrayList<Book> list = bc.selectList();
		
		if(list.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			return;
		}
		
		for(Book b : list) {
			System.out.println(b);
		}
	}
	
	public void searchBook() {
		String keyword;
		
		sc.nextLine();
		
		System.out.print("검색할 도서명 : ");
		keyword = sc.nextLine();
		
		ArrayList<Book> list = bc.searchBook(keyword);
		
		if(list.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
			return;
		}
		
		for(Book b : list) {
			System.out.println(b);
		}
	}
	
	public void deleteBook() {
		String title, author;
		Book result;
		
		sc.nextLine();
		
		System.out.print("도서명 : ");
		title = sc.nextLine();
		System.out.print("작가 : ");
		author = sc.nextLine();
		
		result = bc.deleteBook(title, author);
		
		if(result == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			return;
		}
		
		System.out.println("성공적으로 삭제되었습니다.");
	}
	
	public void ascBook() {
		if(bc.ascBook() != 1) {
			System.out.println("정렬에 실패하였습니다.");
			return;
		}
		
		System.out.println("정렬에 성공하였습니다.");
	}
	
}
