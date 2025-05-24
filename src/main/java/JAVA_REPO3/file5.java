package JAVA_REPO3;


//**Iterate Through Elements**
import java.util.HashMap;

public class file5 {
	
	public static void main(String args[]) {
		HashMap<String,String> fruits=new HashMap<String,String>();
		fruits.put("M","Mango");
		fruits.put("O","Orange");
		fruits.put("G","Guava");
		fruits.put("A","Apple");
		fruits.put("P","Pinapple");
		fruits.put("S","Strawberry");
		
		//There is not specific order
		for(String key:fruits.keySet())
		{
			System.out.println("Key: "+key+ " Value: "+fruits.get(key));	
		}	
		
	}

}
