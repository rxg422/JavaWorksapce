package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
	
	public static void main(String[] args) {
		try {
			// 1. 경로를 지정하지 않고 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			// 2. 경로 지정 후 파일 생성
			File f2 = new File("C:/aaa/test.txt");
//			f2.createNewFile();

			// 3. 폴더 생성
			File bFolderFile = new File("C:/bbb");
			bFolderFile.mkdir();
			
			// 4. 다중 폴더 생성
			File cdFolder = new File("C:/ccc/ddd");
			cdFolder.mkdirs();
			
			// 5. 폴더 및 파일 생성
			File a = new File("C:/aaa");
			if(!(a.exists())) {
				a.mkdir();
			}
			
			// File에서 제공하는 메서드
			System.out.println(a.isFile());
			System.out.println(a.isDirectory());
			
			System.out.println("파일명 : "+ f1.getName());
			System.out.println("상위폴더: "+ f1.getName());
			System.out.println("파일 용량 : "+ f1.getName());
			System.out.println(f1.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
