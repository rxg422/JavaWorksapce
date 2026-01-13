package com.kh.parctice04.map.model.vo;

public class Member {
	
	private	String passwd;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String passwd, String name) {
		super();
		this.passwd = passwd;
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [passwd=" + passwd + ", name=" + name + "]";
	}
	
}
