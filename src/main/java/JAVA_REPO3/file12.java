package JAVA_REPO3;

//**Check if Element Exists**
import java.util.HashMap;

public class file12 {
	
	public static void main(String args[]) {
		HashMap<String,String> fruits=new HashMap<String,String>();
		fruits.put("O","Orange");
		fruits.put("M","Mango");
		fruits.put("G","Guava");
		fruits.put("A","Apple");
		fruits.put("P","Pinapple");
		fruits.put("S","Strawberry");
		
		System.out.println(fruits.containsKey("M"));
		System.out.println(fruits.containsValue("Mango"));
		
	}

}
