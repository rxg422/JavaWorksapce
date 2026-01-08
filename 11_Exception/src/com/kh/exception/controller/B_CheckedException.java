package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	public void method1() {
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		try {
//			System.out.println("Input : ");
//			String str = br.readLine();
//			System.out.println("Input length : " + str.length());
//		} catch (IOException e) {
//			System.out.println("IOException");
//			e.printStackTrace();
//		}
		
		System.out.println("Input : ");
		String str = br.readLine();
	}
	
}
