package com.kh.practice06.generics.view;

import java.util.Scanner;

import com.kh.practice06.generics.controller.FarmController;
import com.kh.practice06.generics.model.vo.Farm;
import com.kh.practice06.generics.model.vo.Fruit;
import com.kh.practice06.generics.model.vo.Nuts;
import com.kh.practice06.generics.model.vo.Vegetable;

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
		boolean result = false;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			kind = sc.nextInt();
			
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("수량 : ");
			n = sc.nextInt();
			
			switch(kind) {
			case 1 :
				result = fc.addNewKind(new Fruit("과일", name), n);
				break;
			case 2 :
				result = fc.addNewKind(new Vegetable("채소", name), n);
				break;
			case 3 :
				result = fc.addNewKind(new Nuts("견과", name), n);
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(result) {
				System.out.println("새 농산물이 추가되었습니다.");
				return;
			}
			
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
		}
	}
	
	public void removeKind() {
		int kind;
		String name;
		boolean result = false;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			kind = sc.nextInt();
			
			System.out.print("이름 : ");
			name = sc.next();
			
			switch(kind) {
			case 1 :
				result = fc.removeKind(new Fruit("과일", name));
				break;
			case 2 :
				result = fc.removeKind(new Vegetable("채소", name));
				break;
			case 3 :
				result = fc.removeKind(new Nuts("견과", name));
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(result) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				return;
			}
			
			System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
		}
	}
	
	public void changeAmount() {
		int kind, n;
		String name;
		boolean result = false;
		
		while(true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			kind = sc.nextInt();
			
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("수정할 수량 : ");
			n = sc.nextInt();
			
			switch(kind) {
			case 1 :
				result = fc.changeAmount(new Fruit("과일", name), n);
				break;
			case 2 :
				result = fc.changeAmount(new Vegetable("채소", name), n);
				break;
			case 3 :
				result = fc.changeAmount	(new Nuts("견과", name), n);
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(result) {
				System.out.println("농산물 수량이 수정되었습니다.");
				return;
			}
			
			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
		}
	}
	
	public void printFarm() {
		
		for(Farm f : fc.printFarm().keySet()) {
			System.out.println(f.getKind() + " : " + f.toString() + "(" + fc.printFarm().get(f) + "개)");
		}
	}
	
	public void buyFarm() {
		
	}
	
	public void removeFarm() {
		
	}
	
	public void printBuyFarm() {
		
	}
	
}
