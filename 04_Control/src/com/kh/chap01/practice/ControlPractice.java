package com.kh.chap01.practice;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n메뉴 번호를 입력하세요 : ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1 :
			System.out.print("입력");
			break;
		case 2 :
			System.out.print("수정");
			break;
		case 3 :
			System.out.print("조회");
			break;
		case 4 :
			System.out.print("삭제");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			return;
		}
		
		System.out.println(" 메뉴입니다.");
	}
	
	public void practice2() {
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("양수만 입력해주세요.");
		}
		else if(n%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}
	
	public void practice3() {
		System.out.print("국어 : ");
		float kor = sc.nextFloat();
		
		System.out.print("수학 : ");
		float mat = sc.nextFloat();
		
		System.out.print("영어 : ");
		float eng = sc.nextFloat();
		
		int total = (int)(kor+eng+mat);
		float avg = total / 3.0f;
		
		if(!(kor>=40&&eng>=40&&mat>=40&&avg>=60)) {
			System.out.println("불합격입니다.");
			return;
		}
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("수학 : %d\n", mat);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("합계 : %d\n", total);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.println("축하합니다, 합격입니다!");
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "봄";
		
		switch(month) {
		case 3, 4, 5 :
			season = "봄";
			break;
		case 6, 7, 8 :
			season = "여름";
			break;
		case 9, 10, 11 :
			season = "가을";
			break;
		case 12, 1, 2 :
			season = "겨울";
			break;
		default:
			season = "잘못 입력된 값";
		}
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}
	
	public void practice5() {
		System.out.println("ID : ");
		String id = sc.next();
		sc.nextLine();
		System.out.println("PW : ");
		String pw = sc.next();
		
		if(!id.equals("minmin")) {
			System.out.println("아이디가 틀렸습니다.");
		}
		else if(!pw.equals("Min1234")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else {
			System.out.println("로그인 성공");
		}
	}
	
	public void practice6() {
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();
		
		switch(grade) {
		case "관리자" :
			System.out.print("회원 관리, 게시글 관리,");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성,");
		case "비회원" :
			System.out.print("게시글 조회");
		}
	}
	
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		
		System.out.printf("BMI : %.2f\n", bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}
		else if(bmi < 23) {
			System.out.println("정상체중");
		}
		else if(bmi < 30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		System.out.println("피연산자1 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int n2 = sc.nextInt();
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		char p = sc.next().charAt(0);
		
		double result = 0;
		
		if(n1<=0 || n2<=0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		switch(p) {
		case '+' :
			result = n1 + n2;
			break;
		case '-' :
			result = n1 - n2;
			break;
		case '*' :
			result = n1 * n2;
			break;
		case '/' :
			result = n1 / n2;
			break;
		case '%' :
			result = n1 % n2;
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		System.out.printf("%d %c %d = %f", n1, p, n2, result);
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int mScore = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int lScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hScore = sc.nextInt();
		System.out.print("출석 회수 : ");
		int cnt = sc.nextInt();
		
		double total = (mScore * 0.2) + (lScore * 0.3) + (hScore * 0.3) + cnt;
		
		System.out.println("================= 결과 =================");
		System.out.printf("중간 고사 점수(20) : %.1f\r\n기말 고사 점수(30) : %.1f\r\n과제 점수 (30) : %.1f\r\n출석 점수 (20) : %.1f\r\n총점 : %.1f\n", (mScore * 0.2), (lScore * 0.3), (hScore * 0.3), (double)cnt, (total));
		
		if(cnt <= 14) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]\n", cnt);
		}
		else if(total < 70) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
	}
	
	public void practice10() {
		System.out.print("1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. P/F\n선택 : ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		String pw = sc.next();
		
		if(pw.length() != 4) {
			System.out.println("자리수 안맞음");
		}
		else if(pw.charAt(0)==pw.charAt(1)||pw.charAt(0)==pw.charAt(2)||pw.charAt(0)==pw.charAt(3)
				||pw.charAt(1)==pw.charAt(2)||pw.charAt(1)==pw.charAt(3)||pw.charAt(2)==pw.charAt(3)) {
			System.out.println("실패");
		}
		else {
			System.out.println("성공");
		}

	}
	
}
