package com.arrays;

public class First_Largest_Smallest {
	
	public static void main(String[] args) {
		
		int[] arr= {1,4,2,6,9,5,3,7,2};
		
		//Largest
		int max=Integer.MIN_VALUE;
		
		for(int num: arr) {
			
			if(num > max) {
				
				max = num;
			}
		}
		System.out.println(max);
		
		//smallest
		
		int min = Integer.MAX_VALUE;
		
		for(int num: arr) {
			
			if(num < min) {
				
				min= num;
			}
		}
		System.out.println(min);
	}

}
