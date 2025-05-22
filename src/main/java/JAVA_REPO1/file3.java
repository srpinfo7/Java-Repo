package JAVA_REPO1;

// Iterate over test data
public class file3 {

	public static void main(String[] args) {
		String users[] = { "Sameer", "Manoj", "Purna", "Uttam", "Sipun" };

		for (String user : users) {
			System.out.println("Logging for user: " + user);
			
			if(user.equalsIgnoreCase("Manoj"))
			{
				System.out.println(user+" is an Admin User");
			}
			
			System.out.println("*****************************");
		}

	}

}
