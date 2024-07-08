package com.java8_programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArrConact {
	
	public static void main(String[] args) {
		
		int[] a= {2,5,3};
		int[] b= {4,5,2};
		
		//concat
		int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(array));
		
		//concat with sorting or unique
		int[] array2 = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(array2));
	}

}
