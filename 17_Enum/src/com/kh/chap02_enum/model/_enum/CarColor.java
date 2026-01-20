package com.kh.chap02_enum.model._enum;

import java.util.Arrays;

public enum CarColor {

	BLACK(0, "Black") {
		@Override
		public void printTest() {
			System.out.println("Color Black");
		}
	},
	WHITE(1, "White") {
		@Override
		public void printTest() {
			System.out.println("Color White");
		}
	}, 
	RED(2, "Red") {
		public void printTest() {
			System.out.println("Color Red");
		}
	};
	
	private int color;
	private String name;
	
	private CarColor(int color, String name) {
		this.color = color;
		this.name = name;
	}

	public int getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
	
	// values() : enum 내부의 상수들을 배열 형태로 반환
	public static CarColor valueOf(int color) {
		return Arrays.stream(values()).filter(_enum -> _enum.color == color).
				findFirst().orElseThrow(() -> new RuntimeException("일치하는 색이 없습니다."));
	}
	
	public abstract void printTest();
	
}
