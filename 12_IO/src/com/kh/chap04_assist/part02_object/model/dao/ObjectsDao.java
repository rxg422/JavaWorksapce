package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {

	public void fileSave() {
		Phone phones[] = new Phone[3];
		
		phones[0] = new Phone("iPhone17", 1800000, "1234");
		phones[1] = new Phone("S25U", 1500000, "qwer");
		phones[2] = new Phone("zFilp", 2500000, "7534");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("PhoneArr.txt"))) {
			for(Phone p : phones) {
				oos.writeObject(p);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PhoneArr.txt"))) {
			while(true) {
				Phone p = (Phone)ois.readObject(); // 읽을 객체가 없는 경우 EOFException 발생
				System.out.println(p); 
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch(EOFException e) {
			System.out.println("End File");
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
