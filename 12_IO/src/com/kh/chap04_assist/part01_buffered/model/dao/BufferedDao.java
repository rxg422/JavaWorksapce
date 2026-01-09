package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	public void fileSave() {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(new File("c_buffer.txt")));
			
			bw.write("Hello?");
			bw.newLine();
			bw.write("Hi");
			
			bw.flush();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			String value = "";
			while((value=br.readLine()) != null) {
				System.out.println(value);
			}
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
