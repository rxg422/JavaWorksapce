package com.kh.chap02.override.run;

import com.kh.chap02.override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book("Glock", "Wick", 12000);
		
		System.out.println(b);
		
		// toString() : Object 클래스에 존재, 풀클래스명+@+주소값을 문자열로 반환
		// 오버라이딩 시 참조변수를 제시하는 것으로 객체 내부의 값들을 출력문으로 받아볼 수 있음
	}

}
