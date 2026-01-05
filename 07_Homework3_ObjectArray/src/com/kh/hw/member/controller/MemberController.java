package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private Member m[] = new Member[SIZE];
	private int size=0;
	
	public int existMemberNum() {
		return size;
	}
	
	public boolean checkId(String id) {
		
		for(Member m : m) {
			if(m != null && m.getId().equals(id)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		Member mem = new Member(id, name, password, email, gender, age);
		
		System.out.println(size);
		m[size] = mem;
		
		size++;
		System.out.println(size);
	}
	
	public String searchId(String id) {
		String result;
		
		for(Member m : m) {
			if(m != null && m.getId().equals(id)) {
				return m.information();
			}
		}
		
		return null;
	}
	
	public Member[] searchName(String name) {
		Member mp[] = new Member[SIZE];
		int idx =0;
		
		for(Member m : m) {
			if(m!=null && m.getName().equals(name)) {
				mp[idx] = m;
				idx++;
			}
		}
		
		return mp;
	}
	
	public Member[] searchEmail(String email) {
		Member mp[] = new Member[SIZE];
		
		for(int i=0; m[i]!=null; i++) {
			if(m[i].getEmail().equals(email)) {
				mp[i] = m[i];
			}
			mp[i] = m[i];
		}
		
		return mp;
	}
	
	public boolean updatePassword(String id, String password) {
		for(Member m : m) {
			if(m!=null && m.getId().equals(id)) {
				m.setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateName(String id, String name) {
		for(Member m : m) {
			if(m!=null && m.getId().equals(id)) {
				m.setName(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		for(Member m : m) {
			if(m!=null && m.getId().equals(id)) {
				m.setEmail(email);;
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String id) {
		Member copy[] = new Member[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				System.arraycopy(m, 0, copy, 0, i);
				System.arraycopy(m, i+1, copy, i, SIZE-i-1);
				m = copy;
				size--;
				return true;
			}
		}
		return false;
	}
	
	public void delete() {
		for(int i=0; i<SIZE; i++) {
			m[i] = null;
		}
		size = 0;
	}
	
	public Member[] printAll() {
		return m;
	}
	
}
