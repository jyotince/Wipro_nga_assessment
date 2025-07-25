package classPractice;

import java.util.*; 

public class Day3_lambda_with_Collections { 
	public static void main(String[] args) { 
		List<String> names = Arrays.asList("Alice", "Bob", "Anil", "Kiran", 
		"Amit"); 
		// Print all names 
		names.forEach(name -> System.out.println("Name: " + name)); 
		// Filter names starting with "A" 
		System.out.println("\nNames starting with A:"); 
		names.stream() 
		.filter(n -> n.startsWith("A")) 
		.forEach(System.out::println); 
		// Sort names 
		System.out.println("\nSorted Names:"); 
		names.stream() 
		.sorted() 
		.forEach(System.out::println); 
	} 
} 
