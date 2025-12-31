package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private Member m[] = new Member[SIZE];
	
	public int existMemberNum() {
		return 0;
	}
	
	public boolean checkId(String id) {
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		
	}
	
	public String searchId(String id) {
		return "";
	}
	
	public Member[] searchName(String name) {
		return m;
	}
	
	public Member[] searchEmail(String email) {
		return m;
	}
	
	public boolean updateName(String id, String name) {
		return true;
	}
	
	public boolean updateEmail(String id, String email) {
		return true;
	}
	
	public void delete() {
		
	}
	
	public Member[] printAll() {
		return m;
	}
	
}
