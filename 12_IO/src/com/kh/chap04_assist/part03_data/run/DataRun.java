package com.kh.chap04_assist.part03_data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {

	public static void main(String[] args) {
		DataRun dr = new DataRun();
		dr.fileSave();
		dr.fileRead();
	}
	
	public void fileSave() {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.txt"))) {
			dos.writeBoolean(true);
			dos.writeInt(3);
			dos.writeDouble(3.14);
			dos.writeChar('a');
			dos.writeUTF("String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(DataInputStream dis = new DataInputStream(new FileInputStream("sample.txt"))) {			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
