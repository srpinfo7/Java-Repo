package JAVA_REPO3;

//**Remove Elements**
import java.util.ArrayList;

public class file15 {
	
	public static void main(String args[]) {
		ArrayList<String> fruits=new ArrayList<String>();
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
