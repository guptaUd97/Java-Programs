package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StudentImplSorting {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("deepak", "6000", 22, "physics"));
		studentList.add(new Student("rahul", "9000", 32, "physics"));
		studentList.add(new Student("komal", "1000", 42, "physics"));
		studentList.add(new Student("sudha", "1200", 21, "maths"));
		studentList.add(new Student("priya", "9800", 92, "maths"));
		studentList.add(new Student("jaya", "9000", 22, "chemistry"));
		studentList.add(new Student("janvi", "7000", 21, "chemistry"));
		studentList.add(new Student("pooja", "3000", 22, "biology"));
		studentList.add(new Student("sandhya", "2100", 55, "biology"));
		studentList.add(new Student("aarti", "300", 22, "biology"));
		studentList.add(new Student("aarti", "3009", 21, "CS"));
		
		// filter by age
		List<Student> filterAge = studentList.stream().filter(s -> s.getAge() > 50).collect(Collectors.toList());
		System.out.println(filterAge);
		
		//find highest salary
		String highestSalary = studentList.stream().map(Student :: getSalary).sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(highestSalary);
		
		//Name=Salary
		Map<String, List<String>> nameWithSalary = studentList.stream().collect(Collectors.groupingBy(Student :: getName, Collectors.mapping(Student :: getSalary, Collectors.toList())));
		System.out.println(nameWithSalary);
		
		//Per Department max Salary
		Map<String, Optional<Student>> collect2 = studentList.stream().collect(Collectors.groupingBy(Student :: getDepartment, Collectors.maxBy((a,b)-> a.getSalary().compareTo(b.getSalary()))));
		System.out.println(collect2);
		
		
	}

}
