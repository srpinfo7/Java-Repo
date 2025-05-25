package JAVA_REPO4;

//do-while loop
public class File4 {

	public static void main(String args[]) {

		String username = "user";
		String password = "password";
		int maxtry = 3;
		int attempt = 1;
		boolean loginStatus=false;

		do {
			
			System.out.println("Attempt " + attempt + ": Trying to log in...");
			loginStatus = login(username, password);
			if (loginStatus) {
				System.out.println("Logged in Successfully");
				break;
			} else {
				System.out.println("Logged in Failed, Retrying....");
				System.out.println("*******************************");
			}
			attempt++;
		} while (attempt <= maxtry && !loginStatus);
		
		if(!loginStatus)
		{
			System.out.println( "Login failed after " + maxtry + " attempts.");
		}

	}

	public static boolean login(String username, String password) {
		boolean value = Math.random() > 0.5;
		return value;

	}

}
