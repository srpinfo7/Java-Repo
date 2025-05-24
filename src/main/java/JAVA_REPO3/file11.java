package JAVA_REPO3;

//**Check if Element Exists**
import java.util.HashSet;

public class file11 {
	
	public static void main(String args[]) {
		HashSet<String> fruits=new HashSet<String>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		
		System.out.println(fruits.contains("Apple"));
		
	}

}
