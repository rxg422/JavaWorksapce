package com.kh.practice2.numRange.controller;

import com.kh.practice2.numRange.exception.NumRangeException;

public class NumberController {

	public NumberController() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDouble(int n1, int n2) throws NumRangeException {
		
		if(n1>100 || n1 < 1 || n2>100 || n2 < 1) {
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		
		if(n1 % n2 == 0) {
			return true;
		}
		
		return false;
	}
	
}
