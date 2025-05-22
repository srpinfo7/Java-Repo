package JAVA_REPO1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Search an Element in Array
public class file6 {

	public static void main(String[] args) {

		String[] elements = { "Login", "Dasboard", "Checkout", "Logout" };
		String searchElement = "CHECKOU";
		boolean isPresent = false;

		for (String element : elements) {
			if (element.equalsIgnoreCase(searchElement)) {
				// System.out.println("Element Found");
				isPresent = true;
				break;

			}

		}

		if (isPresent) {
			System.out.println("Element present");
		} else {
			System.out.println("Element is missing");
		}
	}

}
