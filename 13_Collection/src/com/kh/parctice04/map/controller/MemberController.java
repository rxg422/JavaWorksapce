package com.kh.parctice04.map.controller;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.kh.parctice04.map.model.vo.Member;

public class MemberController {
	
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}
		
		map.put(id, m);
		return true;
	}
	
	public String login(String id, String passwd) {
		if(map.containsKey(id) && map.get(id).getPasswd().equals(passwd)) {
			return map.get(id).getName();
		}
		return null;
	}
	
	public boolean changePasswd(String id, String oldPW, String newPW) {
		if(map.containsKey(id) && map.get(id).getPasswd().equals(oldPW)) {
			map.get(id).setPasswd(newPW);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
			map.get(id).setName(newName);
		}
	}
	
	public TreeMap sameName(String name) {
		TreeMap<String, String> tree = new TreeMap<>();
		for (String s : map.keySet()) {
			if(map.get(s).getName().equals(name)) {
				tree.put(s, map.get(s).getName());
			}
		}
		
		return tree;
//		for(Entry e : map.entrySet()) {
//			System.out.println(e.getKey() + " / " + e.getValue());
//		}
		
//		return null;
		// 전달 받은 name이 저장된 데이터의 이름과 같으면 
		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환 
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것 
	}
	
}
