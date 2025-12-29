package com.kh.chap03_class.model.vo;

public class Person {
	
	private String id, pw, name, phone, email;
	private int age;
	private char gender;
	
	public Person(String id, String pw, String name, int age, char gender, String phone, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void changeName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}
	
	
	
}
