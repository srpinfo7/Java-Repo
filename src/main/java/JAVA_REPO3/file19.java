package JAVA_REPO3;

//Store Unique Test Tags or Features
import java.util.HashSet;

public class file19 {
	
	public static void main(String args[]) {
		HashSet<String> testType=new HashSet<String>();
		
		testType.add("Smoke");
		testType.add("Regression");
		testType.add("Sanity");
		testType.add("Monkey");
		testType.add("Integration");
		testType.add("Integration");
		
		System.out.println(testType);

		
	}

}
