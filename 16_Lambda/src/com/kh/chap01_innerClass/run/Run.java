package com.kh.chap01_innerClass.run;

import com.kh.chap01_innerClass.part02_static.model.vo.Member;
import com.kh.chap01_innerClass.part03_local.OuterClass3;

public class Run {
	
	public static void main(String[] args) {
//		OuterClass oc = new OuterClass();
//		
//		oc.method1();
		
//		Member m = new Member.Builder().id("rxg422").name("김태환").age(25).build();
		OuterClass3 oc3 = new OuterClass3();
		Runnable r = oc3.getRunnable(7);
		r.run();
		
	}
	
}
