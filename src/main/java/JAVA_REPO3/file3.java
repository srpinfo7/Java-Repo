package JAVA_REPO3;


//Create & Print Elements
import java.util.HashSet;

public class file3 {
	
	public static void main(String args[]) {
		HashSet<String> fruits=new HashSet<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		
		//There is not specific order
		
		System.out.println("HashSet: "+fruits);		
		
	}

}
