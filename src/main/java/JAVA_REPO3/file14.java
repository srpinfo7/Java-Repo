package JAVA_REPO3;

//**Remove Elements**
import java.util.HashSet;

public class file14 {
	
	public static void main(String args[]) {
		HashSet<String> fruits=new HashSet<String>();
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
