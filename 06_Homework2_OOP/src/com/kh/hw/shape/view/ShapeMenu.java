package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		while(true) {
			System.out.println(" ===== 도형 프로그램 ===== ");
			System.out.print("3. 삼각형\n4. 사각형\n9. 프로그램 종료\n메뉴 번호 : ");
			int input = sc.nextInt();
			
			switch(input){
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그맴을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
		
		
	}
	
	public void triangleMenu() {
		sc.nextLine();
		
		while(true) {
			System.out.println(" ===== 삼각형 ===== ");
			System.out.print("1. 삼각형 면적\n2. 삼각형 색칠\n3. 삼각형 정보\n9. 메인으로\n메뉴 번호 : ");
			int input = sc.nextInt();
			
			switch(input){
			case 1, 2:
				inputSize(1, input);
				break;
			case 3:
				printInformation(1);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void squareMenu() {
		sc.nextLine();
		
		while(true) {
			System.out.println(" ===== 사각형 ===== ");
			System.out.print("1. 사각형 둘레\n2. 사각형 면적\n3. 사각형 색칠\n4. 사각형 정보\n9. 메인으로\n메뉴 번호 : ");
			int input = sc.nextInt();
			
			switch(input){
			case 1, 2, 3:
				inputSize(2, input);
				break;
			case 4:
				printInformation(2);
				break;
			case 9:
				System.out.println("“메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		int h, w;
		String color;
		double result;
		// 삼각형 일때
		if(type==1) {
			if(menuNum==1) {
				System.out.print("높이 : ");
				h = sc.nextInt();
				System.out.print("너비 : ");
				w = sc.nextInt();
				
				result = tc.calcArea(h, w);
				System.out.println("삼각형 면적 : " + result);
				
			}
			if(menuNum==2) {
				System.out.print("색깔을 입력하세요 : ");
				color = sc.next();
				
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다");
			}
			
		}
		
		if(type==2) {
			if(menuNum==1) {
				System.out.print("높이 : ");
				h = sc.nextInt();
				System.out.print("너비 : ");
				w = sc.nextInt();
				
				result = scr.calcPerimeter(h, w);
				System.out.println("삼각형 면적 : " + result);
			}
			if(menuNum==2) {
				System.out.print("높이 : ");
				h = sc.nextInt();
				System.out.print("너비 : ");
				w = sc.nextInt();
				
				result = scr.calcArea(h, w);
				System.out.println("삼각형 면적 : " + result);
			}
			if(menuNum==3) {
				System.out.print("색깔을 입력하세요 : ");
				color = sc.next();
				
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다");
			}
			
		}
	}
	
	public void printInformation(int type) {
		if(type == 1) {
			System.out.println(tc.print());
		}
		if(type == 2) {
			System.out.println(scr.print());
		}
	}
	
}
