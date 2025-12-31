package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		Phone phArr[] = new Phone[3];
		
		for(int i=0; i<phArr.length; i++) {
			System.out.println(phArr[i]);
			// NPE(Null)
//			System.out.println(phArr[i].getName());
		}
	}

}
