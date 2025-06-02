package JAVA_REPO6;

import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class TreeSetExample {
	 public static void main(String[] args) {
	        CopyOnWriteArraySet<String> parallelTests = new CopyOnWriteArraySet<>();
	        parallelTests.add("LoginTest");
	        parallelTests.add("LogoutTest");
	        parallelTests.add("LogoutTest1");
	        parallelTests.add("LogoutTest2");
	        parallelTests.add("LogoutTest3");
	        
	        parallelTests.add("LoginTest"); // Duplicate ignored

	        System.out.println("Parallel-safe unique tests: " + parallelTests);
	    }
}
