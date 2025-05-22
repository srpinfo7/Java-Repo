package JAVA_REPO1;

// Create reusable login method
public class file4 {

	public void login(String user,String password) {
		System.out.println("Logging in for user:"+user+" with password:"+password);
		
	}
	public static void main(String[] args) {
		file4 data=new file4();
		data.login("Sameer", "Samtech");
		data.login("Sipun", "lucky");

	}

}
