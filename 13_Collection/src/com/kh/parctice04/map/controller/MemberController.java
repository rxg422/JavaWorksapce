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
	}
	
}
