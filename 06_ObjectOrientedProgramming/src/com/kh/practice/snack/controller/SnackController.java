package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s = new Snack();
	
	public SnackController() {
		// TODO Auto-generated constructor stub
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
//		String result, kind, name, flavor;
//		int numOf, price;
//		
//		kind = s.getKind();
//		name = s.getName();
//		flavor = s.getFlavor();
//		numOf = s.getNumOf();
//		price = s.getPrice();
//		
//		result = kind + "(" + name + " - " + flavor + ") " + numOf + "개 " + + price + "원";
//		
//		return result;
		
		return s.information();
	}
	
}
