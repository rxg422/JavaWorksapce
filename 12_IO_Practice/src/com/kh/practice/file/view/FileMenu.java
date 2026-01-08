package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	private StringBuilder sb = new StringBuilder();
	
	public void mainMenu() {
		
		int menu;
		while(true) {
			System.out.print("***** My Note *****\n1. 노트 새로 만들기\n2. 노트 열기\n3. 노트 열어서 수정하기\n9. 끝내기\n메뉴 번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		String input, title;
		char isSave=' ';
		
		sb.delete(0, sb.length());
		sc.nextLine();
		while(true) {
			System.out.print("내용 : ");
			input = sc.nextLine();
			
			if(input.equals("ex끝it")) {
				break;
			}
			
			sb.append(input+"\n");
		}
		
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			title = sc.next();
			
			if(fc.checkName(title)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				isSave = sc.next().charAt(0);
				
				switch(isSave) {
				case 'y', 'Y' :
					break;
				case 'n', 'N' :
					continue;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				
			}
			
			break;
		}
		
		fc.fileSave(title, sb);
	}
	
	public void fileOpen() {
		String fName;
		
		System.out.print("열 파일 명 : ");
		fName = sc.next();
		
		if(!fc.checkName(fName)) {
			System.out.println("없는 파일입니다.");
			return;
		}
		
		System.out.println(fc.fileOpen(fName));
	}
	
	public void fileEdit() {
		String input, fName;
		
		System.out.print("수정할 파일 명 : ");
		fName = sc.next();
		
		if(!fc.checkName(fName)) {
			System.out.println("없는 파일입니다.");
			return;
		}
		
		sb.delete(0, sb.length());
		sc.nextLine();
		while(true) {
			System.out.print("내용 : ");
			input = sc.nextLine();
			
			if(input.equals("ex끝it")) {
				break;
			}
			
			sb.append(input+"\n");
		}
		
		fc.fileEdit(fName, sb);
	}
	
}
