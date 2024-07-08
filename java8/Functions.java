package com.java8;

import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		
		Function<Integer, Integer> squr= i -> i*i;
		System.out.println(squr.apply(5));
		Function<Integer, Integer> req= i -> 2*i;
		System.out.println(req.apply(2));
		
		//functional chaining
		
		System.out.println(squr.andThen(req).apply(2));
		System.out.println(squr.compose(req).apply(2));
		
		
		//without function feature
		Functions functions=new Functions();
		System.out.println("without function feature :"+functions.squre(5));
	}
	
	public int squre(int i) {
	int	sqr=i*i;
	return sqr;
	}
	
}
