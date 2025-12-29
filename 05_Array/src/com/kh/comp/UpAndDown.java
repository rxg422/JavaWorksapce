package com.kh.comp;

import java.util.Scanner;

public class UpAndDown {
	
	Scanner sc = new Scanner(System.in);
	
	public void upDown() {
		int rand = (int)(Math.random() * 100 + 1);
		int cnt = 0, input;
		
		
		System.out.printf("난수 : %d\n", rand);
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맟춰보세요 : ");
			input = sc.nextInt();
			
			if(input<1 || input>100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue;
			}
			
			if(input < rand) {
				System.out.println("Up!");
			}
			
			if(input > rand) {
				System.out.println("Down!");
			}
			
			cnt++;
			
			if(input == rand) {
				System.out.printf("정답입니다!\n%d회만에 맞추셨습니다.", cnt);
				return;
			}
		}
	}
	
}
