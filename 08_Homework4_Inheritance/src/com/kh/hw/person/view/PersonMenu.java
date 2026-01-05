package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Person;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		int pCnt[] = pc.personCount();
		System.out.printf("학생은 최대 3명까지 저장할 수 있습니다.\n현재 저장된 학생은 %d명입니다.\n", pCnt[0]);
		System.out.printf("사원은 최대 10명까지 저장할 수 있습니다.\n현재 저장된 사원은 %d명입니다.\n", pCnt[1]);
		
		int menu;
		while(true) {
			System.out.print("1. 학생 메뉴\n2. 사원 메뉴\n9. 끝내기\n메뉴 번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("Exit Program");
				return;
			default :
				System.out.println("Wrong menu");
			}
		}
	}
	
	public void studentMenu() {
		int menu, pCnt;
		while(true) {
			pCnt = pc.personCount()[0];
			System.out.print("1. 학생 추가\n2. 학생 보기\n9.메인으로\n메뉴 번호 : ");
			menu = sc.nextInt();
			
			if(pCnt >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				
				switch(menu) {
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println("Go to Main");
					return;
				default :
					System.out.println("Wrong Menu");
				}
				
				continue;
			}
			
			switch(menu) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("Go to Main");
				return;
			default :
				System.out.println("Wrong Menu");
			}
		}
	}
	
	public void employeeMenu() {
		int menu, eCnt;
		while(true) {
			eCnt = pc.personCount()[1];
			System.out.print("1. 사원 추가\n2. 사원 보기\n9.메인으로\n메뉴 번호 : ");
			menu = sc.nextInt();
			
			if(eCnt >= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				
				switch(menu) {
				case 2:
					printEmployee();
					break;
				case 9:
					System.out.println("Go to Main");
					return;
				default :
					System.out.println("Wrong Menu");
				}
				
				continue;
			}
			
			switch(menu) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("Go to Main");
				return;
			default :
				System.out.println("Wrong Menu");
			}
		}
	}
	
	public void insertStudent() {
		String name, major;
		int age, grade;
		double height, weight;
		char isAdd;
		
		System.out.print("학생 이름 : ");
		name = sc.next();
		System.out.print("학생 나이 : ");
		age = sc.nextInt();
		System.out.print("학생 키 : ");
		height = sc.nextDouble();
		System.out.print("학생 몸무게 : ");
		weight = sc.nextDouble();
		System.out.print("학생 학년 : ");
		grade = sc.nextInt();
		System.out.print("학생 전공 : ");
		major = sc.next();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		
		System.out.println(pc.personCount()[0]	);
		
		if(pc.personCount()[0]<3) {
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			isAdd = sc.next().charAt(0);
			if(!(isAdd == 'n' || isAdd == 'N')) {
				insertStudent();
			}
		}
	}
	
	public void printStudent() {
//		Person p[] = pc.printStudent();
		
		for(Person p : pc.printStudent()) {
			if(p!=null) {
				System.out.println(p.toString());
			}
		}
	}

	public void insertEmployee() {
		String name, dept;
		int age, salary;
		double height, weight;
		char isAdd;
		
		System.out.print("사원 이름 : ");
		name = sc.next();
		System.out.print("사원 나이 : ");
		age = sc.nextInt();
		System.out.print("사원 키 : ");
		height = sc.nextDouble();
		System.out.print("사원 몸무게 : ");
		weight = sc.nextDouble();
		System.out.print("사원 연봉 : ");
		salary = sc.nextInt();
		System.out.print("사원 부서 : ");
		dept = sc.next();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		if(pc.personCount()[1]<10) {
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			isAdd = sc.next().charAt(0);
			if(!(isAdd == 'n' || isAdd == 'N')) {
				insertEmployee();
			}
		}
	}
	
	public void printEmployee() {
		for(Person p : pc.printEmployee()) {
			if(p!=null) {
				System.out.println(p.toString());
			}
		}
	}
	
}
