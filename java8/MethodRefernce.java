package com.java8;

public class MethodRefernce {
	public static void main(String[] args) {
		
		//use of method refernce
		FunctionalInterfaceDemo fn= MainReference :: test;
		fn.method1();
		
		//use of lambda
		fn= ()-> System.out.println("this is lambda...");
		fn.method1();
		
	}
}

class MainReference{
	static void test() {
		System.out.println("this is use for method refrence...");
	}
	
}
