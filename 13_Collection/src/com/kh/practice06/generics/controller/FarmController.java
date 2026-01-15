package com.kh.practice06.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice06.generics.model.vo.Farm;

public class FarmController {
	
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<Farm>();
	
	public boolean addNewKind(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			return false;
		}
		
		hMap.put(f, amount);
		return true;
	}
	
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			hMap.replace(f, amount);
			return true;
		}
		
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
	
}
