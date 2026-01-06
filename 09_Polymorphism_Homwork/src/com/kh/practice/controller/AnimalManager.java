package com.kh.practice.controller;

import com.kh.practice.mode.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		Animal animal[] = new Animal[5];

		animal[0] = new Dog("하랑", "진도", 12);
		animal[1] = new Cat("시랑", "페르시안", "이란", "회색");
		animal[2] = new Cat("먼지", "먼치킨", "루이지애나", "검정");
		animal[3] = new Dog("구름", "허스키", 8);
		animal[4] = new Cat("소망", "시베리안", "러시아", "삼색");
		
		for(Animal a : animal) {
			a.speak();
		}
	}

}
