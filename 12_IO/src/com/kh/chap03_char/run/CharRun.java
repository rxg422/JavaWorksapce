package com.kh.chap03_char.run;

import com.kh.chap03_char.model.vo.FileCharDao;

public class CharRun {

	public static void main(String[] args) {
		FileCharDao fcd = new FileCharDao();
		
		fcd.fileSave();
		fcd.fileRead();
	}
	
}
