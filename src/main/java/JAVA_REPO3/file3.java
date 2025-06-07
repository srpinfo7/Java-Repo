package JAVA_REPO3;


//Create & Print Elements
import java.util.HashSet;
import java.util.Iterator;

public class file3 {
	
	public static void main(String args[]) {
		HashSet<String> fruits=new HashSet<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Pinapple");
		fruits.add("Strawberry");
		
		//There is not specific order
		
		System.out.println("HashSet: "+fruits);		
		
		Iterator<String> it=fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
