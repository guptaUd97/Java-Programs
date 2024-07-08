package com.java8_programs;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,6,2,8,6,1,4,6,25,1);
		
		long count = list.stream().count();
		System.out.println(count);
	}
}
