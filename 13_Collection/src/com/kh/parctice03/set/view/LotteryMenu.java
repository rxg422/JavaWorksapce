package com.kh.parctice03.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.parctice03.set.contorller.LotteryController;
import com.kh.parctice03.set.mode.vo.Lottery;

public class LotteryMenu {

	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 =========="); 
		
		int menu;
		while(true ) {
			System.out.print("******* 메인 메뉴 *******\n1. 추첨 대상 추가\n2. 추첨 대상 삭제\n3. 당첨 대상 확인\n4. 정렬된 당첨 대상 확인\n5. 당첨 대상 검색\n9. 종료\n\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				insertObject();
				break;
			case 2 :
				deleteObject();
				break;
			case 3 :
				winObject();
				break;
			case 4 :
				sortedWinObject();
				break;
			case 5 :
				searchWinner();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	
	public void insertObject() {
		int n, idx=0;
		String name, phone;
		
		System.out.print("추가할 추첨 대상 수 : ");
		n = sc.nextInt();
		
		
		while(idx<n) {
			System.out.print("이름 : ");
			name = sc.next();
			
			System.out.print("핸드폰 번호('-'빼고) : ");
			phone = sc.next();
			
			if(!(lc.insertObject(new Lottery(name, phone)))) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.\n");
				continue;
			}
			
			idx++;
			System.out.println();
		}
		
		System.out.println("추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		String name, phone;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("핸드폰 번호('-'빼고) : ");
		phone = sc.next();
		
		if(!(lc.deleteObject(new Lottery(name, phone)))) {
			System.out.println("존재하지 않는 대상입니다.");
			return;
		}
		
		System.out.println("삭제 완료 되었습니다.");
	}
	
	public void winObject() {
		HashSet<Lottery> set = lc.winObject();
		
		if(set == null) {
			System.out.println("추첨 대상을 추가해주세요.");
			return;
		}
		
		System.out.println(set);
	}
	
	public void sortedWinObject() {
		if(lc.winObject() == null) {
			System.out.println("추첨 대상을 추가해주세요.");
			return;
		}
		
		Iterator<Lottery> iter = lc.sortedWinObject().iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}
	
	public void searchWinner() {
		String name, phone;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("핸드폰 번호('-'빼고) : ");
		phone = sc.next();
		
		if(!(lc.searchWinner(new Lottery(name, phone)))) {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
			return;
		}
		
		System.out.println("축하합니다. 당첨 목록에 존재합니다.");
	}
	
}
