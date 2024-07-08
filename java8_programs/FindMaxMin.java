package com.java8_programs;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMaxMin {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(4,7,9,2,8,10);
		
		//Largest
		Integer largest = list.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("Largest number:"+largest);
		
		Optional<Integer> largest1 = list.stream().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(largest1.get());
		
		//Smallest
		Integer smallest = list.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.println("Smallest number :"+smallest);
		
		Integer smallest1 = list.stream().sorted().findFirst().get();
		System.out.println(smallest1);
		
		//SecondLargest
		Integer secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondLargest:"+secondLargest);
		
		//find two largest
		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList());
		System.out.println("Two largest no:"+collect);
		
		//--------------------------Max Min--------------------
		Integer max = list.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println("max - "+max);
		
		Integer min = list.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println(min);
		
		
	}

}
