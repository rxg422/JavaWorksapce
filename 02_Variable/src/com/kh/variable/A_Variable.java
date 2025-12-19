package com.kh.variable;

public class A_Variable {
	/*
	 변수 사용 이유
	 1. 가독성
	 2. 재사용성
	 3. 유지보수성 
	 */
	
	
	// 시급과 근무시간과 근무일수를 곱해 월급을 계산해주는 메서드
	public void printVariable() {
		// 변수 선언
		int pay = 8500;
		int time = 6;
		int day = 5;
		
		System.out.println("=== 변수 사용 전 ===");
		System.out.println("시급 : 8500");
		System.out.println("근무 시간 : 6");
		System.out.println("근무 일수 : 5");
		System.out.println("김태환 : " + 8500 * 6 * 5);
		System.out.println("김태환1 : " + 8500 * 6 * 5);
		System.out.println("김태환2 : " + 8500 * 6 * 5);
		System.out.println("김태환3 : " + 8500 * 6 * 5);
		
		System.out.println();
		
		System.out.println("=== 변수 사용 후 ===");
		System.out.println("김태환 : " + pay * time * day);
		System.out.println("김태환1 : " + pay * time * day);
		System.out.println("김태환2 : " + pay * time * day);
		System.out.println("김태환3 : " + pay * time * day);
	}

	public void declareVariable() {
		// 변수 선언
		boolean isTrue;
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		float fNum; // 소수점 7자리
		double dNum; // 소수점 15자리(자바 실수 대표 자료형)
		char ch;
		String str;
		
		// 변수 초기화
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		fNum = 3.14f;
		dNum = 3.141592d;
		ch = '가';
		str = "한글";	
	}
	
	public void initVariable() {
		boolean isTrue = false;
		int longInt = 999_999_999; // '_'를 이용해서 자릿수 구분
		byte bNum = 1;
		
		// 오버플로우
		bNum += 127;
		System.out.println(bNum);
	}
	
	// 상수
	public void constant() {
		int age = 20;
		age = 21;
		
		// 상수는 대문자로 선언
		final int AGE = 21;
//		AGE = 22; // 오류 : 상수라 변경 불가
	}
}
