package com.java8;

interface InternationalSchool{
	
	void department();
	void role();
	default int countOfuser(int count) {
		return count;
	}
	static void schoolName() {
		System.out.println("This is a Internatinal School whic is e-learning platform");
	}
	
}

class Teacher implements InternationalSchool{

	@Override
	public void department() {
		System.out.println("This is Computer Deparment");
		
	}

	@Override
	public void role() {
		System.out.println("Computer Teacher...");
		
	}
	
//	@Override
//	public static void schoolName() {
//		System.out.println("this is override..");
//	}
	
}

class Facaulty implements InternationalSchool{

	@Override
	public void department() {
		System.out.println("This PCM Department...");		
	}

	@Override
	public void role() {
		System.out.println("Im a Math Profe...");
		
	}
	
	public int countOfuser(int count) {
		return count;
	}
	
	
}

public class DeafultAndStaticMethod {

	public static void main(String[] args) {
		
		InternationalSchool.schoolName();
		//Teacher.schoolName();
		
		Teacher teacher = new Teacher();
		teacher.department();
		teacher.role();
		
		Facaulty facaulty = new Facaulty();
		facaulty.department();
		facaulty.role();
		int countOfuser = facaulty.countOfuser(10);
		System.out.println(countOfuser);

	}
}