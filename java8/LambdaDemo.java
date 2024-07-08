package com.java8;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class LambdaDemo {
	
	//without lambda
	public int sum(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		LambdaDemo demo=new LambdaDemo();
		System.out.println("without lambda :"+ demo.sum(4, 5));
		
		//using lambda
		BiConsumer<Integer, Integer> sum  =(a,b) ->System.out.println(a+b);
		sum.accept(3, 4);
		
		
	}

}
