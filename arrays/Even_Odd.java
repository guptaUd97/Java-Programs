package com.arrays;

public class Even_Odd {

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,6,9,5,3,7,2};
		
		// even 
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] % 2 == 0) {
				
				System.out.print(arr[i]+" ");
				
			}
		}
		
		System.out.println();
		//odd
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] % 2 != 0) {
				
				System.out.print(arr[i]+ " ");
			}
		}
	}
}
