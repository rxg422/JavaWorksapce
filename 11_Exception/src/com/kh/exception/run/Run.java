package com.kh.exception.run;

import com.kh.exception.controller.A_UnCheckedException;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class Run {

	public static void main(String[] args) throws C_CustomException {
		A_UnCheckedException a = new A_UnCheckedException();
		B_CheckedException b = new B_CheckedException();
		
//		a.method1();
//		a.method2();
//		a.method3();
		
//		b.method1();
		
		// 에러 강제 발생
		throw new C_CustomException("ee");
	}
	
}
