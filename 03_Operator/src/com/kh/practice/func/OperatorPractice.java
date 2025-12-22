package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / person));
		System.out.println("남는 사탕 개수 : " + (candy % person));
	}

	public void practice2() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		byte grade = sc.nextByte();
		
		System.out.print("반(숫자만) : ");
		byte classes = sc.nextByte();
		
		System.out.print("번호(숫자만) : ");
		byte num = sc.nextByte();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("성적(소수점아래둘째자리까지) : ");
		float test = sc.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.", grade, classes, num, name, gender=='M'? '남': '여', test);
	}
	
	public void practice3() {
		System.out.println("나이 : ");
		byte age = sc.nextByte();
		
		System.out.println(age<=13 ? "어린이" : age<=19 ? "청소년" : "성인");
	}
	
	public void practice4() {
		System.out.print("국어 : ");
		float kor = sc.nextFloat();
		
		System.out.print("영어 : ");
		float eng = sc.nextFloat();
		
		System.out.print("수학 : ");
		float mat = sc.nextFloat();
		
		int total = (int)(kor+eng+mat);
		float avg = total / 3.0f;
		
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.println(avg >= 60.0f ? "합격" : "불합격");
	}
	
	public void practice5() {
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String id = sc.nextLine();
		System.out.println(id.charAt(9)=='1'||id.charAt(9)=='3' ? "남자" : "여자");
	}
	
	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();		
		System.out.print("입력 : ");
		int i = sc.nextInt();
		
		
		System.out.println(i<=num1||i>num2 ? true : false);
	}
	
	public void practice7() {
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		
		System.out.println(num1==num2&&num1==num3 ? true : false);
	}
	
	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int aPay = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int bPay = sc.nextInt();		
		System.out.print("C사원의 연봉 : ");
		int cPay = sc.nextInt();
		
		double aTotal = aPay * 1.4;
		double bTotal = bPay;
		double cTotal = cPay * 1.15;
		
		
		System.out.println("A사원연봉/연봉+a : " + aPay + "/" + aTotal);
		System.out.println(aTotal >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("A사원연봉/연봉+a : " + bPay + "/" + bTotal);
		System.out.println(bTotal >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("A사원연봉/연봉+a : " + cPay + "/" + cTotal);
		System.out.println(cTotal >= 3000 ? "3000 이상" : "3000 미만");
	}
	
}
