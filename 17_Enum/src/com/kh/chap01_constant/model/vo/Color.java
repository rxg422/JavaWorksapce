package com.kh.chap01_constant.model.vo;

// 자동차의 색에 대한 상수 값을 객체로 관리
public class Color {
	
	public static final Color BLACK = new Color(0, "Black");
	public static final Color WHITE = new Color(1, "White");
	public static final Color RED = new Color(2, "Red") {
		// 익명 내부 클래스 생성 방식
		public void method() {
			System.out.println("Only RED");
		}
	};
	
	private int color;
	private String strColor;
	
	private Color(int color, String strColor) {
		this.color = color;
		this.strColor = strColor;
	}

	public int getColor() {
		return color;
	}

	public String getStrColor() {
		return strColor;
	}
	
}
