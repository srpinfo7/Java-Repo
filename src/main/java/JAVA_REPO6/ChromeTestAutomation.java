package JAVA_REPO6;

public class ChromeTestAutomation extends BrowserConfig implements BrowserActions {

	// Constructor
	public ChromeTestAutomation() {
		super("Chrome");
		initializeDriver();
		logCurrentDateTime();
	}

	@Override
	void initializeDriver() {
		System.out.println("Initializing Chrome WebDriver...");
		// In real use case, WebDriver code would go here
	}

	@Override
	public void launchBrowser() {
		System.out.println("Launching Chrome browser...");
	}

	@Override
	public void navigateTo(String url) {
		System.out.println("Navigating to: " + url);
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing Chrome browser...");
	}

	public static void main(String[] args) {
		ChromeTestAutomation test = new ChromeTestAutomation();
		test.launchBrowser();
		test.navigateTo("https://automationpractice.com");
		test.closeBrowser();
	}
}