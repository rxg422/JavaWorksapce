package com.kh.variable;

public class Run {
	
	public static void main(String[] args) {
		A_Variable a_var = new A_Variable();
		B_Cast b_cast = new B_Cast();
		C_Scanner c_scan = new C_Scanner();
		
		a_var.printVariable();
		System.out.println();
		a_var.initVariable();
		
		System.out.println();
		
		b_cast.autoCasting();
		System.out.println();
		b_cast.forceCasting();
		
		c_scan.inputTest1();
	}
	
}
