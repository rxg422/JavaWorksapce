package com.kh.chap05.construntor.model.vo;

public class User {
	
	// 인스턴스 변수 선언
	private String userID;
	private int age;
	private char gender;
	
	// 기본 생성자
	public User() {
		
	}
	
	// 오버로딩 된 생성자
	public User(String userID) {
		this.userID = userID;
	}
	public User(String userID, int age, char gender) {
		this(userID);
		this.age = age;
		this.gender = gender;
	}

	
	// getter/setter 메서드
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
