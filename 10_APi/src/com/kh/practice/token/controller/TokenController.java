package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
//		String arr[] = str.split(" ");
		
		str = "";
//		for(String s : arr) {
//			str += s;
//		}
		
		while(stn.hasMoreTokens()) {
			str += stn.nextToken();
		}
		
//		return str.replace(" ", "");
//		return String.valueOf(str.toCharArray());
		return str;
	}
	
	public String firstCap(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	
	public int findChar(String input, char one) {
		int cnt = 0;
		
		for(char c : input.toCharArray()) {
			if(c == one) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
}
