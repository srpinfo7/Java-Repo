package JAVA_REPO3;


//Create & Print Elements
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class file4 {
	
	public static void main(String args[]) {
		HashMap<String,String> fruits=new HashMap<String,String>();
		fruits.put("M","Mango");
		fruits.put("O","Orange");
		fruits.put("G","Guava");
		fruits.put("A","Apple");
		fruits.put("P","Pinapple");
		fruits.put("S","Strawberry");
		
		//There is not specific order
		
		System.out.println("HashMap: "+fruits);		
		
		Iterator<Map.Entry<String,String>> it=fruits.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
