package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		int size = mc.existMemberNum();
		System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.", MemberController.SIZE);
		System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.", size);
		
		while(true) {
			if(size < 10) {
				System.out.print("1. 새 회원 등록\n2. 회원 검색\n3. 회원 정보 수정\n4. 회원 삭제\n5. 모두 출력\n9. 끝내기\n메뉴 번호 : ");
				
			}
			else {
				System.out.print("2. 회원 검색\n3. 회원 정보 수정\n4. 회원 삭제\n5. 모두 출력\n9. 끝내기\n메뉴 번호 : ");
			}
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를  
		// 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와  
		// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함 
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고 
		// 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후 
		// 다시 아이디를 받도록 함 
		// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를 
		// 출력 후 다시 성별을 입력하도록 함 
		// 아이디부터 나이까지 모든 데이터를 받았으면  
		// mc의 insertMember메소드의 매개변수로 넘김
	}
	
	public void searchMember() {
		
	}
	
	public void searchId() {
		
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		
	}

	public void updatePassword() {
		
	}

	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
	
}
