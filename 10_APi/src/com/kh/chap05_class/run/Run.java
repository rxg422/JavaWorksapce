package com.kh.chap05_class.run;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.kh.chap05_class.model.vo.Book;

public class Run {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성된다.
		// Class 클래스는 클래스 자체 정보를 가져올 때 사용됨.
		test1();
		
	}
	
	public static void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성된다.
		// Class 클래스는 클래스 자체 정보를 가져올 때 사용됨.
		
		// Object 클래스의 getClass() 사용
		Book b = new Book();
		Class c1 = b.getClass();
		
		Class c2 = Book.class;
		Class c3 = Class.forName("com.kh.chap05_class.model.vo.Book");
		Book b1 = (Book)c3.newInstance();
		Constructor[] cons = c3.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		Field fields[] = c3.getFields();
		
		for(Field f : fields) {
			System.out.println(f);
		}
	}
	
	
	
}
