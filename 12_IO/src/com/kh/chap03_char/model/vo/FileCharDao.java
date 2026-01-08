package com.kh.chap03_char.model.vo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	public void fileSave() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("Input\n");
			fw.write("Output\n");
			fw.write("한글\n");
			
			char arr[] = {'a', 'p', 'p'};
			fw.write(arr);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value=fr.read())!=-1) {
				System.out.print((char)value);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
