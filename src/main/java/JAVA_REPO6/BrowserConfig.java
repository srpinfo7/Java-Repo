package JAVA_REPO6;

import java.util.Date;
import java.util.Calendar;

abstract class BrowserConfig {
	String browserName;

	// Constructor
	public BrowserConfig(String browserName) {
		this.browserName = browserName;
		System.out.println("Browser selected: " + browserName);
	}

	// Abstract method to initialize browser
	abstract void initializeDriver();

	// Utility to log current date and time
	public void logCurrentDateTime() {
		Date currentDate = new Date();
		Calendar calendar = Calendar.getInstance();

		System.out.println("Current Date: " + currentDate.toString());
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Month is 0-based
		System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
	}
}
