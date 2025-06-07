package JAVA_REPO7;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class File1 {

	public static void regular() {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		fruits.add("Anar");

		int count = 0;

		for (String f : fruits) {
			if (f.startsWith("A")) {
				count++;
			}
		}
		System.out.println("Count is " + count);
	}

	public static void streamFilter() {

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		fruits.add("Anar");

		long c = fruits.stream().filter(s -> s.startsWith("A")).count();
		System.out.println("Count is " + c);

		long c1 = Stream.of("Mango", "Apple").filter(s -> s.startsWith("A")).count();
		System.out.println("Count is " + c1);

		// print all fruits
		fruits.stream().filter(s -> s.length() > 6).limit(1).forEach(s -> System.out.println(s));

	}
	
	public static void streamMap(String[] arr)
	{
		Stream.of("Mango", "Apple","Pinapple").filter(s -> s.endsWith("e")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		List<String> nameList=Arrays.asList(arr);
		System.out.println("******************************");
		nameList.stream().filter(s->s.startsWith("A")).map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
		System.out.println("******************************");
	}
	
	public static void combineStram()
	{
	     ArrayList<String> names = new ArrayList<>();

	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add("Diana");
	        names.add("Ethan");
	        
	        ArrayList<String> cities = new ArrayList<>();
	        cities.add("New York");
	        cities.add("London");
	        cities.add("Paris");
	        cities.add("Tokyo");
	        cities.add("Sydney");
	        
	        
	        Stream<String> newStream=Stream.concat(names.stream(), cities.stream());
	        //newStream.sorted().map(s->s.toUpperCase()).forEach(s -> System.out.println(s));
	        
	        boolean flag=newStream.anyMatch(s -> s.equalsIgnoreCase("london"));
	        System.out.println(flag);
	}
	
	public static void streamCollect()
	{
		 ArrayList<String> cities = new ArrayList<>();
	        cities.add("New York");
	        cities.add("London");
	        cities.add("Paris");
	        cities.add("Tokyo");
	        cities.add("Sydney");
//
//	        List<String> bigCities=cities.stream().filter(s -> s.length()>5).map(s->s.toUpperCase()).collect(Collectors.toList());
//	       // System.out.println(bigCities.get(0));
//	        System.out.println(bigCities);
	        
	        String[] bigCities = cities.stream()
	        	    .filter(s -> s.length() > 5)
	        	    .map(String::toUpperCase)
	        	    .toArray(String[]::new); 
	       for(String a : bigCities)
	       {
	    	   System.out.println(a);
	       }
	        
	}
	
	
	public static void printUnique()
	{
		int[] nums= {9,2,4,3,2,4,5,7,2};
//		Set<Integer> st= Arrays.stream(nums)
//                .boxed().sorted()
//                .collect(Collectors.toSet());
//		  for(int a : st)
//	       {
//	    	   System.out.print(a+ " ");
//	    	   
//	       }
//		  
//		  System.out.println("\n");
		
		Arrays.stream(nums).boxed().distinct().sorted().forEach(s -> System.out.print(s+" "));
		System.out.println("\n");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printUnique();
		System.out.println("******************************");
		regular();
		System.out.println("******************************");
		streamFilter();
		System.out.println("******************************");
		String arr[]= {"Alice", "Bob", "Charlie","Alina", "Allan", "Allison", "Alok",
			    "Alyssa", "Amara", "Amelia", "Amir", "Amit",
			    "Amy", "Ananya", "Andre", "Andrea", "Andrew",
			    "Angela", "Angelica", "Anika", "Anil", "Anita",
			    "Anjali", "Anna", "Anne", "Ansh", "Anushka",
			    "Aparna", "April", "Ariana", "Arjun", "Arman",
			    "Arnav", "Arnold", "Arthur", "Arya", "Aryan",
			    "Ashish", "Ashley", "Ashton", "Asma", "David", "Eve"};
		streamMap(arr);
		combineStram();
		System.out.println("******************************");
		streamCollect();

	}

}
