package com.kh.practice.chap02.abstractNInterface.controller;

import com.kh.practice.chap02.abstractNInterface.model.vo.*;

public class PhoneController {

	private String result[] = new String[2];
	
	public String[] method() {
		Phone p[] = new Phone[2];
		
		p[0] = new GlaxyNote9();
		p[1] = new V40();
		
		
		for(int i=0; i<p.length; i++) {
			result[i] = p[i].printInformation();
		}
		 // 2개의 Phone 객체를 저장할 수 있는 객체배열 생성 
		  // 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장  
		  // for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의 
		// 반환 값을 String배열에 담아 반환
		
		return result;
	}
	
}
