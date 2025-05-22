package JAVA_REPO1;

//Decide browser to launch
public class file2 {

	public static void main(String[] args) {
		String browser="firefox";
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test Running in google Chrome");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.out.println("Test Running in Microsoft Edge");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test Running in Mozilla Firefox");
		}
		else
		{
			System.out.println("Not a Valid Browser");
		}
		
	}

}
