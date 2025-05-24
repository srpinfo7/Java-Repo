package JAVA_REPO3;

//**Check if Element Exists**
import java.util.ArrayList;

public class file10 {
	
	public static void main(String args[]) {
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		
		System.out.println(fruits.contains("Mango"));
		
	}

}
