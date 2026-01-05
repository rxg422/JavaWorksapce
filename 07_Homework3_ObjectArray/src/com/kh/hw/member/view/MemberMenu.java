package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		int size;
		int menu;
		
		while(true) {
			size = mc.existMemberNum();
			System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", MemberController.SIZE);
			System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", size);
			
			
			if(size < 10) {
				System.out.print("1. 새 회원 등록\n2. 회원 검색\n3. 회원 정보 수정\n4. 회원 삭제\n5. 모두 출력\n9. 끝내기\n메뉴 번호 : ");
				
				menu = sc.nextInt();
				
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
			else {
				System.out.print("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.\n2. 회원 검색\n3. 회원 정보 수정\n4. 회원 삭제\n5. 모두 출력\n9. 끝내기\n메뉴 번호 : ");
				
				menu = sc.nextInt();
				
				switch(menu) {
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
	}
	
	public void insertMember() {
		String id, name, password, email;
		char gender;
		int age;
		
		while(true) {
			System.out.print("아이디 : ");
			id = sc.next();
			
			if(mc.checkId(id)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue;
			}
			
			break;
		}
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("비밀번호 : ");
		password = sc.next();
		
		System.out.print("이메일 : ");
		email = sc.next();
		
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().charAt(0);
			
			if(gender == 'm' || gender == 'M') {
				gender = 'M';
				break;
			}
			
			if(gender == 'f' || gender == 'F') {
				gender = 'F';
				break;
			}
			
			System.out.println("성별을 다시 입력하세요.");
		}
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	public void searchMember() {
		int menu;
		
		System.out.println("1. 아이디로 검색하기\n2. 이름으로 검색하기\n3. 이메일로 검색하기\n9. 메인으로 돌아가기\n메뉴 번호 : ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void searchId() {
		String id, result;
		
		System.out.print("아이디 : ");
		id = sc.next();
		
		result = mc.searchId(id);
		
		if(result == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		
		System.out.println("찾으신 회원 조회 결과입니다.");
		System.out.println(result);
	}
	
	public void searchName() {
		System.out.print("이름 : ");
		String name = sc.next();
		Member m[] = mc.searchName(name);
		
		if(m[0]==null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		
		System.out.println("찾으신 회원 조회 결과입니다.");
		for(Member mem : m) {
			if(mem!=null) {
				System.out.println(mem.information());				
			}
		}
	}
	
	public void searchEmail() {
		System.out.print("이메일 : ");
		String email = sc.next();
		Member m[] = mc.searchName(email);
		
		if(m[0]==null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		
		System.out.println("찾으신 회원 조회 결과입니다.");
		for(Member mem : m) {
			if(mem!=null) {
				System.out.println(mem.information());				
			}
		}
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기\n2. 이름 수정하기\n3. 이메일 수정하기\n9. 메인으로 돌아기기\n메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void updatePassword() {
		System.out.println("수정할 회원 ID: ");
		String id = sc.next();
		System.out.println("pw : ");
		String pw = sc.next();
		
		if(mc.updatePassword(id, pw)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void updateName() {
		System.out.println("수정할 회원 ID: ");
		String id = sc.next();
		System.out.println("pw : ");
		String name = sc.next();
		
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updateEmail() {
		System.out.println("수정할 회원 ID: ");
		String id = sc.next();
		System.out.println("email : ");
		String email = sc.next();
		
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void deleteMember() {
		System.out.print("1. 특정 회원 삭제하기\n2. 모든 회원 삭제하기\n메인으로 돌아가기\n메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 ID : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하시겠습니까?(Y/N) : ");
		char isDel = sc.next().charAt(0);
		if(isDel=='y' || isDel=='Y') {
			if(mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			}
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(Y/N) : ");
		char isDel = sc.next().charAt(0);
		if(isDel=='y' || isDel=='Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}
	
	public void printAll() {
		for(int i=0; mc.printAll()[i]!=null; i++) {
			System.out.println(mc.printAll()[i].information());
		}
	}
	
}
