package com.java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(4,7,9,2,8,10);
		
		//Even number
		List<Integer> even = list.stream().filter(x-> x % 2==0).collect(Collectors.toList());
		System.out.println(even);
		
		//Odd number
		List<Integer> odd = list.stream().filter(x-> x % 2 !=0).collect(Collectors.toList());
		System.out.println(odd);
		
	}

}
