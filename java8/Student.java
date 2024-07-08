package com.java8;

public class Student {
	
	private String name;
	private String salary;
	private int age;
	private String department;
	public Student(String name, String salary, int age, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", salary=" + salary + ", age=" + age + ", department=" + department + "]";
	}
	
	

}
