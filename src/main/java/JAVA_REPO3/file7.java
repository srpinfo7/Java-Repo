package JAVA_REPO3;

//**Iterate Through Elements**
import java.util.HashSet;

public class file7 {
	
	public static void main(String args[]) {
		HashSet<String> fruits=new HashSet<String>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		
		//There is not specific order
		for(String fruit:fruits)
		{
			System.out.println("Fruits: "+fruit);	
		}	
		
	}

}
