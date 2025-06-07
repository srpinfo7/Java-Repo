package JAVA_REPO6;

import java.util.ArrayList;

public class AlistExercise {

	  public static void main (String[] args) {
	        
	        ArrayList<String> a=new ArrayList<>();
	        a.add("apple");
	        a.add("banana");
	        a.add("cherry");
	        a.add("mango");
	        a.add("apple");
	        
	        System.out.println(a);
	        
	        a.remove("apple");
	        
	        System.out.println(a);
	        
	        if(a.contains("orange"))
	        {
	            System.out.println("Orange is found");
	        }
	        
	        System.out.println(a.size());
	        
	        for(String b:a)
	        {
	            System.out.println("Index :"+a.indexOf(b)+ " value :"+ b);
	        }
	    }
}
