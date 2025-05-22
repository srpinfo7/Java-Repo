package JAVA_REPO1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Store test data in HashMap
public class file5 {

	public static void main(String[] args) {
		Map<String,String> users=new HashMap<String, String>();
		users.put("Sameer", "Lucky");
		users.put("Sipun", "Swag");
		users.put("admin", "admin");
		
		for(Entry<String, String> user:users.entrySet())
		{
			System.out.println("User : "+user.getKey()+" Password : "+user.getValue());
		}

	}

}
