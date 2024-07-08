package com.java8_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DublicateShow {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(3,6,2,8,6,1,4,6,25,1);
		
		Set<Integer> set=new HashSet<>();
		List<Integer> collect = list.stream().filter(x -> !set.add(x)).collect(Collectors.toList());
		System.out.println(collect);
	}

}
