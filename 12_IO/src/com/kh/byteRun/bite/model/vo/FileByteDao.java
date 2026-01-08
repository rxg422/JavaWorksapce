package com.kh.byteRun.bite.model.vo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	
	// 외부 매체로 데이터를 출력하는 프로그램
	public void fileSave() {
		FileOutputStream fout = null;
		
		// FileOutputStream
		try {
			// 파일이 존재하지 않으면 파일을 생성하며 통로 개설
			fout = new FileOutputStream(new File("a_byte.txt"), true);
			// 데이터 출력(-128~127)
			fout.write(97);
			
			byte arr[] = {99, 100, 101};
			fout.write(arr);
			
			fout.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 외부 매체로부터 데이터를 입력받는 프로그램
	public void fileRead() {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt");
			
			int readValue;
			
//			do {
//				readValue = fin.read();
//				System.out.println(readValue);
//			} while(readValue != -1);
			
			while((readValue = fin.read()) != -1) {
				System.out.println(readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
