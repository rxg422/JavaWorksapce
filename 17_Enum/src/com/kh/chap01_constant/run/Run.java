package com.kh.chap01_constant.run;

import java.util.Calendar;

import com.kh.chap01_constant.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setCarColor(0); // BLACK
		car1.setCarColor(Car.BLACK);
	
		// 단점
		car1.setCarColor(Calendar.YEAR);
		
		Car car2 = new Car();
		car2.setCarColor(0);
	}
	
}
