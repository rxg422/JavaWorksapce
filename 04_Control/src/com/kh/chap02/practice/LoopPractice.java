package com.kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int n = sc.nextInt();
			
			if(n<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			
			for(int i=0; i<n; i++) {
				System.out.printf("%2d ", i+1);
				if((i+1) % 10 == 0) {
					System.out.println();
				}
			}
			
			break;
		}
		
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int n = sc.nextInt();
			
			if(n<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			
			for(int i=n; i>0; i--) {
				System.out.printf("%2d ", i);
				if(i % 10 == 0) {
					System.out.println();
				}
			}
			
			break;
		}
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += (i+1);
		}
		
		System.out.printf("sum : %d\n", sum);
	}
	
	public void practice4() {
		int n1, n2, tmp;
		
		while(true) {
			System.out.print("첫 번쨰 숫자 : ");
			n1 = sc.nextInt();
			System.out.print("두 번쨰 숫자 : ");
			n2 = sc.nextInt();
			
			if(n1<1 || n2<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			
			if(n1>n2) {
				tmp = n1;
				n1 = n2;
				n2 = tmp;
			}
			
			for(int i=n1; i<=n2; i++) {
				System.out.printf("%2d ", i);
//				if(i % 10 == 0) {
//					System.out.println();
//				}
			}
			
			break;
		}
	}
	
	public void practice5() {
		int n;
		while(true) {
			System.out.print("숫자 : ");
			n = sc.nextInt();
			
			if(n>=10) {
				System.out.println("9이하의 숫자만 입력해주세요.");
				break;
			}
			
			for(int i=n; i<=9; i++) {
				System.out.printf("%d단\n", i);
				for(int j=1; j<=9; j++) {
					System.out.printf("%d*%d=%d ", i, j, i*j);
				}
				System.out.println("\n");
			}
		}
	}
	
	public void practice6() {
		System.out.print("시작 숫자 : ");
		int n = sc.nextInt();
		
		System.out.print("공차 : ");
		int t = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.printf("%d ", n + t * i);
		}
	}
	
	public void practice7() {
		int n1, n2, result;
		String str;
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");
			str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			if(!(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.print("정수1 : ");
			n1 = sc.nextInt();
			System.out.print("정수2 : ");
			n2 = sc.nextInt();
			

			sc.nextLine();
			
			if((str.equals("/") || str.equals("/")) && n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			switch(str) {
			case "+" :
				result = n1 + n2;
				break;
			case "-" :
				result = n1 - n2;
				break;
			case "*" :
				result = n1 * n2;
				break;
			case "/" :
				result = n1 / n2;
				break;
			case "%" :
				result = n1 % n2;
				break;
			default :
				result = 0;
			}
			
			
			System.out.printf("%d %s %d = %d\n", n1, str, n2, result);
		}
	}
	
	public void practice8() {
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		
		if(n<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		
		System.out.println("소수입니다.");
	}
	
	public void practice11() {
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		int cnt = 0;
		int dCnt = 0;
		
		if(n<2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for(int i=2; i<=n; i++) {
			cnt = 0;
			
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			
			if(cnt==1) {
				System.out.printf("%d ", i);
				dCnt++;
			}
		}
		
		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개입니다.\n", n, dCnt);
	}
	
	public void practice12() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int n = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			if(i%2==0 || i%3==0) {
				System.out.printf("%d ", i);
			}
			if(i%2==0 && i%3==0) {
				cnt++;
			}
		}
		
		System.out.printf("\ncount : %d\n", cnt);
	}
	
}
