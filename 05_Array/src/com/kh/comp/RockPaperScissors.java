package com.kh.comp;

import java.util.Scanner;

public class RockPaperScissors {

	Scanner sc = new Scanner(System.in);
	
	public void rps() {
		String input, name;
		int com, result=0, wCnt=0, lCnt=0, dCnt=0;
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		name = sc.next();
		
		sc.nextLine();
		
		while(true) {
			
			System.out.print("가위바위보 : ");
			input = sc.next();
			
			com = (int) (Math.random() * 3);
			
			if(input.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", wCnt+lCnt+dCnt, wCnt, dCnt, lCnt);
				return;
			}
			
			switch(input) {
			case "가위" :
				result = 0 - com;
				break;
			case "바위" :
				result = 1 - com;
				break;
			case "보" :
				result = 2 - com;
				break;
			default:
				System.out.println("다시 입력");
				continue;
			}
			
			System.out.printf("%s님 : %s\n컴퓨터 : %s\n",name, input, com==0 ? "가위" : com==1 ? "바위" : "보");
			
			switch(result) {
			case 1, -2:
				System.out.println("이겼습니다.");
				wCnt++;
				break;
			case -1, 2:
				System.out.println("졌습니다.");
				lCnt++;
				break;
			default:
				System.out.println("비겼습니다.");
				dCnt++;
			}
			
			System.out.println();
		}
	}
	
}
