package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController extends CharCheckException{
	
	public CharacterController() {

	}
	
	public int countAlpha(String s) throws CharCheckException  {
		int cnt=0;
		
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		
		for(char c : s.toCharArray()) {
			if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
}
