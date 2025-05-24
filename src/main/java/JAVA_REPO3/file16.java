package JAVA_REPO3;

//**Remove Elements**
import java.util.LinkedList;

public class file16 {
	
	public static void main(String args[]) {
		LinkedList<String> fruits=new LinkedList<String>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		
		System.out.println(fruits);
		System.out.println(fruits.remove("Apple"));
		System.out.println(fruits);
		
	}

}
