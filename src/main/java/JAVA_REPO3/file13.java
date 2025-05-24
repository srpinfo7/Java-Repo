package JAVA_REPO3;

//**Remove Elements**
import java.util.HashMap;

public class file13 {
	
	public static void main(String args[]) {
		HashMap<String,String> fruits=new HashMap<String,String>();
		fruits.put("O","Orange");
		fruits.put("M","Mango");
		fruits.put("G","Guava");
		fruits.put("A","Apple");
		fruits.put("P","Pinapple");
		fruits.put("S","Strawberry");
		
		System.out.println(fruits);
		System.out.println(fruits.remove("M"));
		System.out.println(fruits);
		
	}

}
