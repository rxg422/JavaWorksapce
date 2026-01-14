package com.kh.practice06.generics.view;

import java.util.Scanner;

import com.kh.practice06.generics.controller.FarmController;

public class FarmMenu {

	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		
		int menu;
		while(true) {
			System.out.print("******* 메인 메뉴 *******\n1. 직원메뉴\n2. 손님 메뉴\n9. 종료\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				adminMenu();
				break;
			case 2 : 
				customerMenu();
				break;
			case 9 : 
				System.out.println("프로그램 종료.");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void adminMenu() {
		int menu;
		while(true) {
			System.out.print("******* 직원 메뉴 *******\n1. 새 농산물 추가\n2. 종류 삭제\n3. 수량 수정\n4. 농산물 목록\n9. 메인으로 돌아가기\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				addNewKind();
				break;
			case 2 : 
				removeKind();
				break;
			case 3 :
				changeAmount();
				break;
			case 4 :
				printFarm();
				break;
			case 9 : 
				System.out.println("메인화면으로 돌아갑니다.");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void customerMenu() {
		System.out.println("현재 KH마트 농산물 수량 : ");
		printFarm();
		
		int menu;
		while(true) {
			System.out.print("******* 고객 메뉴 *******\n1. 농산물 사기\n2. 농산물 빼기\n3. 구입한 농산물 보기\n9. 메인으로 돌아가기\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				buyFarm();
				break;
			case 2 : 
				removeFarm();
				break;
			case 3 :
				printBuyFarm();
				break;
			case 9 : 
				System.out.println("메인화면으로 돌아갑니다.");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void addNewKind() {
		int kind, n;
		String name;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			kind = sc.nextInt();
			
			if(kind > 0 || kind < 4) {
				return;
			}
			
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("수량 : ");
			n = sc.nextInt();
			
			
		}
		
		
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 추가 농산물의 이름, 수량도 
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가  
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.  
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc(FarmController)의  
//		addNewKind()로 넘기고 전달 받은 반환 값이 true면 “새 농산물이 추가되었습니다.”, 
//		false면 “새 농산물 추가에 실패하였습니다. 다시 입력해주세요.” 출력 
	}
	
	public void removeKind() {
		
	}
	
	public void changeAmount() {
		
	}
	
	public void printFarm() {
		
	}
	
	public void buyFarm() {
		
	}
	
	public void removeFarm() {
		
	}
	
	public void printBuyFarm() {
		
	}
	
}
