package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentImpl {
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("deepak", "6000", 22, "physics"));
		studentList.add(new Student("rahul", "9000", 32, "physics"));
		studentList.add(new Student("komal", "1000", 42, "physics"));
		studentList.add(new Student("sudha", "1200", 21, "maths"));
		studentList.add(new Student("priya", "9800", 92, "maths"));
		studentList.add(new Student("jaya", "9000", 22, "chemistry"));
		studentList.add(new Student("janvi", "7000", 22, "chemistry"));
		studentList.add(new Student("pooja", "3000", 22, "biology"));
		studentList.add(new Student("sandhya", "2100", 22, "biology"));
		studentList.add(new Student("aarti", "300", 22, "biology"));
		studentList.add(new Student("aarti", "300", 21, "cs"));
		
		//Sort by only Name list
		List<String> sortList = studentList.stream().map(Student :: getName).sorted().collect(Collectors.toList());
		System.out.println(sortList);
		
		// sort by name or any variable
		Collections.sort(studentList, Comparator.comparing(Student :: getDepartment));
		System.out.println(studentList);
		
		//reverse order
		List<String> reverse = studentList.stream().map(Student :: getSalary).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverse);
		Collections.sort(studentList, Comparator.comparing(Student :: getSalary).reversed());
		System.out.println(studentList);
		
		//Sort By Name or age
		Collections.sort(studentList, Comparator.comparing(Student :: getName).thenComparingInt(Student :: getAge));
		System.out.println(studentList);
		
		// name start with j
		List<Student> startWith = studentList.stream().filter(s -> s.getAge() >= 22 && s.getName().startsWith("j")).collect(Collectors.toList());
		System.out.println(startWith);
		
		// start with int no
		List<Student> collect = studentList.stream().filter(s -> String.valueOf(s.getAge()).startsWith("2")).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		
	}

}
