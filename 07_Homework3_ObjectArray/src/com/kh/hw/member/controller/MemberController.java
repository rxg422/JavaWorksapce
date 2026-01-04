package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private Member m[] = new Member[SIZE];
	private int size=0;
	
	public int existMemberNum() {
		System.out.println(size);
		return size;
	}
	
	public boolean checkId(String id) {
		for(Member mem : m) {
			if(mem==null) {
				return false;
			}
			if(mem.getId()==id) {
				return true;
			}
		}
		
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		Member mem = new Member(id, name, password, email, gender, age);
		
		System.out.println(size);
		m[size] = mem;
		
		size++;
		System.out.println(size);
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
