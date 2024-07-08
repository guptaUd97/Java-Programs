package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach_Method {
	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		list.add("Mobile");
		list.add("Laptop");
		list.add("Watch");
		list.add("Tablet");
		
		//foreach method
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
	}
}
