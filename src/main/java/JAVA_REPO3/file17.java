package JAVA_REPO3;

//Store and print test steps in sequence.
import java.util.ArrayList;

public class file17 {
	
	public static void main(String args[]) {
		ArrayList<String> testcase=new ArrayList<String>();
		
		testcase.add("Lunch Browser");
		testcase.add("Navigate to login page");
		testcase.add("Enter user id");
		testcase.add("Enter password");
		testcase.add("Click on Login button");
		
		for(int i=0;i<testcase.size();i++)
		{
			System.out.println("Teststep-"+(i+1)+" : "+testcase.get(i));
		}

		
	}

}
