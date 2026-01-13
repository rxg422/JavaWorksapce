package com.kh.parctice04.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;
import com.kh.parctice04.map.controller.MemberController;
import com.kh.parctice04.map.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH 사이트 =========="); 
		 
		int menu;
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.print("1. 회원가입\n2. 로그인\n3. 같은 이름 회원 찾기\n9. 종료\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				joinMembership();
				break;
			case 2 :
				login();
				break;
			case 3 :
				sameName();
				break;
			case 9 :
				System.out.println("Exit");
				return;
			default :
				System.out.println("Try Again");
			}
		}
	}
	
	public void memberMenu() {
		int menu;
		while(true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.print("1. 비밀번호 바꾸기\n2. 이름 바꾸기\n9. 로그아웃\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				changePW();
				break;
			case 2 :
				changeName();
				break;
			case 9 :
				System.out.println("Logout");
				return;
			default :
				System.out.println("Try Again");
			}
		}
	}
	
	public void joinMembership() {
		String id, pw, name;
		
		while(true) {
			System.out.print("ID : ");
			id = sc.next();
			
			System.out.print("PW : ");
			pw = sc.next();
			
			System.out.print("Name : ");
			name = sc.next();
			
			if(!(mc.joinMembership(id, new Member(pw, name)))) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.println("성공적으로 회원가입 완료하였습니다.");
			return;
		}
	}
	
	public void login() {
		String id, pw, result;
		
		while(true) {
			System.out.print("ID : ");
			id = sc.next();
			
			System.out.print("PW : ");
			pw = sc.next();
			
			result = mc.login(id, pw);
			
			if(result == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.println(result + "님, 환영합니다!");
			memberMenu();
			return;
		}
	}
	
	public void changePW() {
		String id, oldPW, newPW;
		
		while(true) {
			System.out.print("ID : ");
			id = sc.next();
			
			System.out.print("Old PW : ");
			oldPW = sc.next();
			
			System.out.print("New PW : ");
			newPW = sc.next();
			
			if(!(mc.changePasswd(id, oldPW, newPW))) {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.println("비밀번호 변경에 성공했습니다.");
			return;
		}
	}
	
	public void changeName() {
		String id, pw, name;
		
		while(true) {
			System.out.print("ID : ");
			id = sc.next();
			
			System.out.print("PW : ");
			pw = sc.next();
			
			name = mc.login(id, pw);
			
			if(name == null) {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
				continue;
			}
			
			System.out.println(name);
			
			System.out.print("New Name : ");
			name = sc.next();
			
			mc.changeName(id, name);
			System.out.println("이름 변경에 성공하였습니다.");
			return;
		}
	}
	
	public void sameName() {
		String name;
		
		System.out.print("Search Name : ");
		name = sc.next();
		
		Set<Entry<String, String>> entrySet = mc.sameName(name).entrySet();
		
		for(Entry<String, String> e : entrySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}
	
}
