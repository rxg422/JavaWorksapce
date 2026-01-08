package com.kh.practice2.numRange.view;

import java.util.Scanner;

import com.kh.practice2.numRange.controller.NumberController;
import com.kh.practice2.numRange.exception.NumRangeException;

public class NumberMenu {
	
	Scanner sc = new Scanner(System.in);
	NumberController nc = new NumberController();

	public void menu() {
		System.out.print("num 1 : ");
		int n1 = sc.nextInt();
		System.out.print("num 2 : ");
		int n2 = sc.nextInt();
		
		try {
			System.out.println("Num1은 Num2의 배수인가? : " + nc.checkDouble(n1, n2));
			
		} catch (NumRangeException e) {
			e.printStackTrace();
		} 
	}
	
}
