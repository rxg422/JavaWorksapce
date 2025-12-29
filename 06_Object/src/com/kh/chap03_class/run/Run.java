package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person("01", "passwd", "Taehwan", 24, 'M', "010-8584-5793", "taehwan422@gmail.com");
		
		p1.changeName("춘식이");
		
		p1.printName();
	}

}
