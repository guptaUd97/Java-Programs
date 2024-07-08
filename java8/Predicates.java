package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class CollegeInfo{
	
	String name;
	String course;
	int fees;
	public CollegeInfo(String name, String course, int fees) {
		super();
		this.name = name;
		this.course = course;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "CollegeInfo [name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}
	
	
	
}
public class Predicates {
	
	public static void main(String[] args) {
		
		List<CollegeInfo> list=new ArrayList<>();
		list.add(new CollegeInfo("Raisoni", "MCA", 80000));
		list.add(new CollegeInfo("Raisoni", "BCA", 50000));
		list.add(new CollegeInfo("Raisoni", "Btech", 100000));
		list.add(new CollegeInfo("RamdevBaba", "MCA", 900000));
		list.add(new CollegeInfo("RamdevBaba", "BSC", 60000));
		
		System.out.println(list);
		
		//using stream
		List<CollegeInfo> fees=  list.stream().filter(x -> x.fees <  60000).collect(Collectors.toList());
		
		System.out.println(fees);
		
		//-----------------------------------------
		
		
		Predicates predi=new Predicates();
		//System.out.println(predi.stringLength("Prdi")); //false
		
		Predicate<String> strLeg= s -> s.length()>=5;
		System.out.println(strLeg.test("Predicate Programs")); //true
		
		Predicate<String> strEven= s-> s.length() % 2==0;
		System.out.println(strEven.test("Predicate Programs"));
		
		//and
		System.out.println(strLeg.and(strEven).test("Predicate Programs"));
		// or
		System.out.println(strLeg.or(strEven).test("Predicate Programs"));
		//neglate
		System.out.println(strLeg.negate().test("Predicate Programs"));
		
		
		
	}
		public boolean stringLength(String str) {
			if(str.length()>=5) {
				return true;
			}else {}
			return false;
		}

}
