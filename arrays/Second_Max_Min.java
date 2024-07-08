package com.arrays;

public class Second_Max_Min {
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,4,2,6,9,5,3,7,2,1,2,9,8};
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for(int num : arr) {
			
			if(num > firstMax) {
				
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			}
		}
		
		System.out.println(firstMax);
		System.out.println(secondMax);
		System.out.println(thirdMax);
	}

}
