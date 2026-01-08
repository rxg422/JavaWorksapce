package com.kh.exception.controller;

public class C_CustomException extends Exception {

	// 1. 예외 처리 클래스 생성 및 Exception 클래스 상속
	// 2. super 키워드로 부모생성자 호출
	
	public C_CustomException() {

	}

	
	public C_CustomException(String msg) {
		super(msg);
	}
	
	
	
}
