package com.java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find_Kth_Value {
	
	public static void getKValue(List<Integer> list, int k) {
		
		Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder()).distinct().limit(k).skip(k-1).findFirst();
		System.out.println(first.get());
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(5, 9, 11, 2, 8, 21, 1, 21); //21,11,9,8,5,2,1
		
		getKValue(number, 6);
		
	}

}
