package com.kh.chap02._abstract.part01.run;

import com.kh.chap02._abstract.part01.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// 추상 클래스 객체 생성
//		Sports s = new Basketball();
		
		Sports sArr[] = new Sports[2];
		sArr[0] = new Basketball();
		sArr[1] = new Football();
		
		for(Sports s : sArr) {
			s.rule();
		}
		
	}
	
}
