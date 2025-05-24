package JAVA_REPO3;

//**Check if Element Exists**
import java.util.LinkedList;

public class file9 {
	
	public static void main(String args[]) {
		LinkedList<String> fruits=new LinkedList<String>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		
		System.out.println(fruits.contains("Mango"));
		
	}

}
