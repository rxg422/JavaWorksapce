package com.kh.practice.chap01.poly.contoller;

import com.kh.practice.chap01.poly.mode.vo.*;

public class LibraryController {

	Member mem = null;
	Book bList[] = new Book[5];
	
	public LibraryController() {
		bList[0] = new CookBook("김치활용", "에드워드리", "넷플릭스", false);
		bList[1] = new CookBook("미슐랭", "안성재", "안성재스튜디오", true);
		bList[2] = new AniBook("지건 마스터", "뷁", "지건협회", 15);
		bList[3] = new CookBook("한식공부", "아기맹수", "넷플릭스", false);
		bList[4] = new AniBook("살인면허", "x사", "살인인정협회", 19);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		
		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book searchList[] = new Book[5];
		int idx = 0;
		for(Book b : bList) {
			if(b!=null && b.getTitle().contains(keyword)) {
				searchList[idx] = b;
				idx++;
			}
		}
		return searchList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		Book rent = bList[index];
		
		if(rent instanceof AniBook && mem.getAge() < ((AniBook) rent).getAccessAge()) {
			result = 1;
		}
		if(rent instanceof CookBook && ((CookBook) rent).isCoupon()) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		
		return result;
	}
	
}
