package com.kh.parctice01.list.music.view;

import java.util.Scanner;

import com.kh.parctice01.list.music.controller.MusicController;
import com.kh.parctice01.list.music.model.vo.Music;

public class MusicView {

	Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMene() {
		int menu;
		
		while(true) {
			System.out.print("******* 메인 메뉴 *******\n1. 마지막 위치에 곡 추가\n2. 첫 위치에 곡 추가\n3. 전체 곡 목록 출력\n4. 특정 곡 검색\n5. 특정 곡 삭제\n"
					+ "6. 특정 곡 정보 수정\n7. 곡명 오름차순 정렬\n8. 가수명 내림차순 정렬\n9. 종료\n메뉴 번호 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				remeveMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}
	
	public void addList() {
		String title, singer;
		int result = 0;
		
		sc.nextLine();
		
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("제목 : ");
		title = sc.nextLine();
		System.out.print("가수 : ");
		singer = sc.nextLine();
		
		result = mc.addList(new Music(title, singer));
		
		if(result != 1) {
			System.out.println("추가 실패");
		}
		
		System.out.println("추가 성공");
	}
	
	public void addAtZero() {
		String title, singer;
		int result = 0;
		
		sc.nextLine();
		
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("제목 : ");
		title = sc.nextLine();
		System.out.print("가수 : ");
		singer = sc.nextLine();
		
		result = mc.addAtZero(new Music(title, singer));
		
		if(result != 1) {
			System.out.println("추가 실패");
		}
		
		System.out.println("추가 성공");
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ****** ");
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		String title;
		Music result;
		
		sc.nextLine();
		
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("제목 : ");
		title = sc.nextLine();
		
		result = mc.searchMusic(title);
		
		if(result == null) {
			System.out.println("검색한 곡이 없습니다.");
			return;
		}
		
		System.out.println(result); 
	}
	
	public void remeveMusic() {
		String title;
		Music result;
		
		sc.nextLine();
		
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("제목 : ");
		title = sc.nextLine();
		
		result = mc.removeMusic(title);
		
		if(result == null) {
			System.out.println("삭제할 곡이 없습니다.");
			return;
		}
		
		System.out.println(result + "을(를) 삭제 하였습니다.");
	}
	
	public void setMusic() {
		String title, fixTitle, singer;
		Music result;
		
		sc.nextLine();
		
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("제목 : ");
		title = sc.nextLine();
		
		System.out.print("수정할 제목 : ");
		fixTitle = sc.nextLine();
		System.out.print("수정할 가수 : ");
		singer = sc.nextLine();
		
		result = mc.setMusic(title, new Music(fixTitle, singer));
		
		if(result == null) {
			System.out.println("수정할 곡이 없습니다.");
			return;
		}
		
		System.out.println(result + "의 값이 변경 되었습니다.");
	}
	
	public void ascTitle() {
		int result;
		
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		result = mc.ascTitle();
		
		if(result != 1) {
			System.out.println("정렬 실패");
		}
		
		System.out.println("정렬 성공");
	}
	
	public void descSinger() {
		int result;
		
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		result = mc.descSinger();
		
		if(result != 1) {
			System.out.println("정렬 실패");
		}
		
		System.out.println("정렬 성공");
	}
	
}
