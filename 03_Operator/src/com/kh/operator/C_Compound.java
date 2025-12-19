package com.kh.operator;

public class C_Compound {
	
	public void method() {
		int i = 12;
		String str = "Hello";
		
		i += 3;
		i -= 5;
		i *= 7;
		i /= 2;
		i %= 4;
		
		str += "World";
		
		System.out.println(i);
		System.out.println(str);
	}
	
}
