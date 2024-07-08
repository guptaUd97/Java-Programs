package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentPractice {
	
	public static void main(String[] args) {
		
	
	List<Student> list = new ArrayList<>();

	list.add(new Student("deepak", "6000", 22, "physics"));
	list.add(new Student("rahul", "9000", 32, "physics"));
	list.add(new Student("komal", "1000", 42, "physics"));
	list.add(new Student("sudha", "1200", 21, "maths"));
	list.add(new Student("priya", "9800", 92, "maths"));
	list.add(new Student("jaya", "9000", 21, "chemistry"));
	list.add(new Student("janvi", "7000", 22, "chemistry"));
	list.add(new Student("pooja", "3000", 22, "biology"));
	list.add(new Student("sandhya", "2100", 22, "biology"));
	list.add(new Student("aarti", "300", 22, "biology"));
	list.add(new Student("aarti", "300", 21, "CS"));
	
	 
	for(Student s: list) {
		//System.out.println(s);
	}
	
	
	}
}


	
	
