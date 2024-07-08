package com.java8_programs;

import java.util.Arrays;
import java.util.List;

public class Second_MINMAX {
	
	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(5, 9, 11, 2, 8, 21, 1, 21,21);
		Integer secondMin = list.stream().sorted((x,y) -> x.compareTo(y)).skip(1).findAny().get();
		System.out.println("secondMin - "+secondMin);
		
		Integer secondMax = list.stream().distinct().sorted((x,y) -> y.compareTo(x)).skip(1).findAny().get();
		System.out.println("secondMax - "+secondMax);
		
		int[] arr= {5, 9, 11, 2, 8, 21, 1, 21,21};
		//secMin
		int min=arr[0];
		int secMin=Integer.MAX_VALUE;
		
		for(int num:arr) {
			if(num < min) {
			secMin=min;
			min=num;
			}
		}
		System.out.println("secMin : "+secMin);
		
		//secMax
		int max=arr[0];
		int secMax=Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(max < num) {
				secMax=max;
				max=num;
			}
		}
		System.out.println(secMax);
	}

}
