package com.kh.chap06.method.run;

import com.kh.chap06.method.model.vo.MethodTest1;
import com.kh.chap06.method.model.vo.MethodTest2;
import com.kh.chap06.method.model.vo.OverloadTest;

public class Run {
	
	public static void main(String[] args) {
		MethodTest1 mt1 = new MethodTest1();
		OverloadTest ol = new OverloadTest();
		
//		mt1.method1();
//		int re2 = mt1.method2();
//		mt1.method3(3, 5);
//		int re4 = mt1.method4(10, 20);
		
		int n = MethodTest2.method(1);
		System.out.println(n);
		
		ol.overload();
		int a = ol.overload(1);
		System.out.println(a);
	}
	
	
	
}
