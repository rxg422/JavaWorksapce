package com.kh.practice.chap02.abstractNInterface.run;

import com.kh.practice.chap02.abstractNInterface.controller.PhoneController;

public class Run {
	
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		for(String s : pc.method()) {
			System.out.println(s + "\n");
			
		}
	}
	
}
