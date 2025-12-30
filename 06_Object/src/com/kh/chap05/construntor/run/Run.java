package com.kh.chap05.construntor.run;

import com.kh.chap05.construntor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// 기본 생성자를 통한 객체 생성
		User user1 = new User();
		User user2 = new User("aa");
		User user3 = new User("bb", 24, 'M');
		
		System.out.println(user3.getUserID());
		System.out.println(user3.getAge());
		System.out.println(user3.getGender());
	}

}
