package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		String kind, name, flavor;
		int numOf, price;
		char input;
		
		System.out.print("종류 : ");
		kind = sc.next();
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("맛 : ");
		flavor = sc.next();
		
		System.out.print("개수 : ");
		numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		price = sc.nextInt();
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		input = sc.next().charAt(0);
		
		if(input == 'Y' || input == 'y') {
			System.out.println(scr.confirmData());
		}
	}
	
}
