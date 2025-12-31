package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMunu {

	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMunu() {
		int menu;
		while(true) {
			System.out.print("1. 사원 추가\n2. 사원 수정\n3. 사원 삭제\n4. 사원 출력\n9. 프로그램 종료\n메뉴 번호를 누르세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("Wrong Menu");
			}
			
		}
	}
	
	public void insertEmp() {
		int empNo, salary;
		String name, phone, dept;
		char gender;
		double bonus;
		
		System.out.print("사원 번호 : ");
		empNo = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		name = sc.next();
		
		System.out.print("사원 성별 : ");
		gender = sc.next().charAt(0);
		
		System.out.print("전화 번호 : ");
		phone = sc.next();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char isMore = sc.next().charAt(0);
		
		if(isMore == 'y' || isMore == 'Y' ) {
			System.out.print("사원 부서 : ");
			dept = sc.next();
			
			System.out.print("사원 연봉 : ");
			salary = sc.nextInt();
			
			System.out.print("보너스 : ");
			bonus = sc.nextDouble();
			
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
			return;
		}
		
		ec.add(empNo, name, gender, phone);
	}
	
	public void updateEmp() {
		int menu;
		
		int salary;
		String phone;
		double bonus;
		
		while(true) {
			System.out.print("1. 전화번호\n2. 사원 연봉\n3. 보너스 율\n9. 돌아가기\n메뉴 번호를 누르세요 : ");
			menu = sc.nextInt();
			
			
			switch(menu) {
			case 1:
				System.out.print("수정할 전화번호 : ");
				phone = sc.next();
				ec.modify(phone);
				break;
			case 2:
				System.out.print("수정할 사원 연봉 : ");
				salary = sc.nextInt();
				ec.modify(salary);
				break;
			case 3:
				System.out.print("수정할 보너스 : ");
				bonus = sc.nextDouble();
				ec.modify(bonus);
				break;
			case 9:
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("Wrong Menu");
			}
			
		}
	}
	
	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까? (y/n) : ");
		char isDel = sc.next().charAt(0);
		
		if(isDel == 'y' || isDel == 'Y') {
			if(ec.remove() == null) {
				System.out.println("데이터 삭제에 성공하였습니다.");
				return;
			}
			System.out.println("데이터 삭제에 실패하였습니다.");
		}
	}
	
	public void printEmp() {
		// 사원정보가 있다면 사원정보 출력, 없다면 “사원 데이터가 없습니다”출력
		if(ec.information() == null) {
			System.out.println("사원 데이터가 없습니다");
			return;
		}
		System.out.println(ec.information());
	}
	
}
