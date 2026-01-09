package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class Run {
	
	public static void main(String[] args) {
		ObjectDao od = new ObjectDao();
		ObjectsDao osd = new ObjectsDao();
		
		System.out.println("=== ObjectDao ===");
		od.fileSave();
		od.fileRead();
		
		System.out.println("=== ObjectsDao ===");
		
		osd.fileSave();
		osd.fileRead();
		
	}
	
}
