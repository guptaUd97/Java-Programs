package com.arrays;

public class Sum_Avg {
	
	public static void main(String[] args) {
		
		int[] arr= {1,4,2,6,9,5,3,7,2};
		
		int sum=0;
		int avg=0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum= sum+arr[i];
			
			avg = sum/arr.length;
		}
		System.out.println(sum);
		
		System.out.println(avg);
	}

}
