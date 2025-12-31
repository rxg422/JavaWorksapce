package com.kh.chap01.after.run;

import com.kh.chap01.after.model.vo.*;

public class AfterRun {

	public static void main(String[] args) {
		Desktop d = new Desktop("Apple", "m3", "iMac", 2500000, true);
		SmartPhone sp = new SmartPhone("Apple", "i-17", "iPhone", 1800000, "KT");
		TV tv= new TV("Samsung", "tv-4k", "OLED 4K", 3400000, 40);
		
		System.out.println(d.information());
		System.out.println(sp.information());
		System.out.println(tv.information());
	}

}
