package com.kh.operator;

public class E_LogicalNegation {
	
	public void method() {
		System.out.println("true의 부정" + !true);
		System.out.println("false의 부정" + !false);
		
		boolean b1 = true;
		boolean b2 = !b1;
		
		boolean b3 = !(5 > 3);
		
	}
	
}
