package com.kh.practice.chap01.poly.view;

import java.util.Scanner;

import com.kh.practice.chap01.poly.contoller.LibraryController;
import com.kh.practice.chap01.poly.mode.vo.Book;
import com.kh.practice.chap01.poly.mode.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		String name;
		int age;
		char gender = 'M';
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().charAt(0);
			
			if(gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
				break;
			}
			System.out.println("성별을 다시 입력해주세요.");
		}
		
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		int menu;
		
		while(true) {
			System.out.print("==== 메뉴 ====\n1. 마이페이지\n2. 도서 전체 조회\n3. 도서 검색\n4. 도서 대여하기\n9. 프로그램 종료하기\n메뉴 번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
	public void selectAll() {
		Book bList[] = lc.selectAll();
		
		for(int i=0; i<bList.length; i++) {
			if(bList[i]!=null) {
				System.out.println(i+ "번 도서 : " +bList[i]);
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		Book searchList[] = lc.searchBook(keyword);
		
		for(int i=0; i<searchList.length; i++) {
			if(searchList[i]!=null) {
				System.out.println(searchList[i]);
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int idx = sc.nextInt();
		
		int result = lc.rentBook(idx);
		
		switch(result) {
		case 0 :
			System.out.println("성공적으로 대여 되었습니다.");
			break;
		case 1 :
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2 :
			System.out.println("성공적으로 대여 되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}
	
}
