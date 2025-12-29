package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("명지원", 22, 180);
		Student student3 = new Student("류수정", 22, 165);
		Student student4 = new Student("김태환", 24, 175);
		
		Student students[] = new Student[4];
		
		student1.setName("김지원");
		student1.setAge(22);
		student1.setHeight(180);
		
//		System.out.printf("%s / %d / %.1f\n", student1.getName(), student1.getAge(), student1.getHeight());
//		System.out.printf("%s / %d / %.1f\n", student2.getName(), student2.getAge(), student2.getHeight());
	
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		
		for(int i=0; i<students.length; i++) {
			System.out.printf("%s / %d / %.1f\n", students[i].getName(), students[i].getAge(), students[i].getHeight());
		}
	}

}
