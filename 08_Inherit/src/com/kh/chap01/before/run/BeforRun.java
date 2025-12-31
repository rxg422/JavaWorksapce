package com.kh.chap01.before.run;

import com.kh.chap01.before.model.vo.Desktop;
import com.kh.chap01.before.model.vo.SmartPhone;

public class BeforRun {

	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "d-01", "데탑", 2000000, true);
		SmartPhone p = new SmartPhone("삼성", "s25", "캘럭시", 800000, "KT");
		
		System.out.println(d.information());
		System.out.println(p.information());
	}

}
