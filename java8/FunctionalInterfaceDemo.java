package com.java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	public abstract void method1();
	//public abstarct void m2();
	
	default void m3() {
		System.out.println("default method..");
	}
	 default void m4() {
		 System.out.println("Its allow multiple default amd static methid...");
	 }
	
	
}

class Test implements FunctionalInterfaceDemo{
	public static void main(String[] args) {
		
		FunctionalInterfaceDemo fn =new Test();
		fn.method1();
		fn.m3();
		fn.m4();
		
	}

	@Override
	public void method1() {
		System.out.println("functional interface allow only one abstract methods..");
		
	}
}


