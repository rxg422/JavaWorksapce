package com.kh.chap02_string.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C_StringTokenizer {

	public void method1() {
		String str = "Java,Oracle,JDBC,HTML,Spring";
		
		String arr[] = str.split(",");
		System.out.println(Arrays.toString(arr));
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		while(stn.hasMoreTokens()) { // 토큰이 있은지 boolean 반환
			System.out.print(stn.nextToken() + " / " + stn.countTokens());
		}
	}
	
}
