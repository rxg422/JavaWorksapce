package com.kh.example.practice5.model.vo;

public class Lotto {
	private int lotto[]; {
		lotto = new int[6];
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
	}
	
	public Lotto() {
		
	}
	
	public void information() {
		System.out.print("로또 번호 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%d ", lotto[i]);
		}
		System.out.println();
	}
}
