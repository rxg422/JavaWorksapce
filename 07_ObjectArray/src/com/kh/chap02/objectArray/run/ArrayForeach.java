package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ArrayForeach {

	public static void main(String[] args) {
		Phone phArr[] = new Phone[3];
		Phone ph1 = new Phone("s25", "glaxy", "Samsung", 750000);
		Phone ph2 = new Phone("iPhone17", "iPhone", "Apple", 900000);
		Phone ph3 = new Phone("Pixel9", "pixel", "Sony", 800000);
		
		phArr[0] = ph1;
		phArr[1] = ph2;
		phArr[2] = ph3;
		
		int totalPrice = 0;
		for(Phone ph : phArr) {
			totalPrice += ph.getPrice();
			System.out.println(ph.information());
		}
		System.out.printf("총 가격 : %d원", totalPrice);
	}

}
