package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		Student std[] = ssm.printStudent();
		
		System.out.println("========== 학생 정보 출력 ==========");
		for(Student s : std) {
			System.out.println(s.information());
		}
		System.out.println();
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.print("학생 점수 합계 : ");
		System.out.println((int)ssm.avgScore()[0]);
		System.out.print("학생 점수 평균 : ");
		System.out.println(ssm.avgScore()[1]);
		System.out.println();
		
		System.out.println("========== 성적 결과 출력 ==========");
		for(Student s : std) {
			System.out.printf("%s는 %s입니다\n", s.getName(), s.getScore()>=StudentController.CUT_LINE ? "통과" : "재시험 대상");
		}
		
	}
	
}
