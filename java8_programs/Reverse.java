package com.java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(4,7,9,2,8,10);
		
		//Reverse sorting order
		List<Integer> reverseSorting = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("reverse sorting number:" + reverseSorting);
		
		//Without sorting
		List<Integer> list1=new ArrayList<>();
		for(Integer reverse: list) {
			list1.add(reverse);
		}
		Collections.reverse(list1);
		System.out.println(list1);
		
		
	}

}
