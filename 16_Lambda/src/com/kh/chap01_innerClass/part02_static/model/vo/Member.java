package com.kh.chap01_innerClass.part02_static.model.vo;

public class Member {
	
	private String id;
	private String name;
	private int age;
	
	public Member() {
		
	}
	
	public static class Builder {
		private String id, name;
		private int age;
		
		public Builder() {

		}
		
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		// 빌더함수 : 빌더클래스의 초기화된 데이터를 검증 후, 외부클래스 객체의 필드로 옮겨서 반환하는 함수
		public Member build() {
			Member m = new Member();
			
			if(id == null) {
				return null;
			}
			
			m.id = id;
			m.name = name;
			m.age = age;
			
			return m;
		}
	}
	
}
