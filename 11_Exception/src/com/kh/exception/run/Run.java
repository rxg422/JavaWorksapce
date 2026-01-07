package com.kh.exception.run;

import com.kh.exception.controller.A_UnCheckedException;

public class Run {

	public static void main(String[] args) {
		A_UnCheckedException a = new A_UnCheckedException();
		
		a.method1();
	}
	
}
