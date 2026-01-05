package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.print("===== 메뉴 =====\n1. 원\n2. 사각형\n9. 끝내기\n메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("Exit Program");
				return;
			default :
				System.out.println("Wrong menu");
			}
		}
	}
	
	public void circleMenu() {
		while(true) {
			System.out.print("===== 원 =====\n1. 원 둘레\n2. 원 넓이\n9. 메인으로\n메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
				break;
			case 9:
				System.out.println("Go to Main");
				return;
			default:
				System.out.println("Wrong menu");
			}
		}
	}
	
	public void rectangleMenu() {
		while(true) {
			System.out.print("===== 사각형 =====\n1. 사각형 둘레\n2. 사각형 넓이\n9. 메인으로\n메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				calcPerimeter();
				System.out.println("Test");
				break;
			case 2:
				calcRectArea();
				break;
			case 9:
				System.out.println("Go to Main");
				return;
			default:
				System.out.println("Wrong menu");
			}
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, r));
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.clacArea(x, y, r));
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.clacPerimeter(x, y, height, width));
		return;
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.clacArea(x, y, height, width));
	}
	
}
