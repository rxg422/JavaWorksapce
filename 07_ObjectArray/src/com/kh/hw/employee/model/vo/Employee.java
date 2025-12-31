package com.kh.hw.employee.model.vo;

public class Employee {
	
	private int empNo, salary;
	private String name, phone, dept;
	private char gender;
	private double bonus;
	
	
	public Employee() {
		super();
	}

	public Employee(int empNo, String name, char gender, String phone) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}
	
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String printEmployee() {
		return name + " " + gender + " " + phone + " " + dept + " " + salary + " " + bonus;
	}
	
	
	
}
