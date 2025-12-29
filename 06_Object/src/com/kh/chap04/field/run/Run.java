package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest1;
import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		FieldTest1 ft1 = new FieldTest1();
		FieldTest2 ft2 = new FieldTest2();
		
//		ft1.test(0);
		
		System.out.println(FieldTest3.PI);
		FieldTest3.test();
	}

}
