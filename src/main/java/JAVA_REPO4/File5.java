package JAVA_REPO4;

//nested loop
public class File5 {
	public static void main(String[] args) {
		String[] usernames = { "user1", "user2", "admin" };
		String[] passwords = { "pass123", "pass456", "admin@123" };

		String[] loginTypes = { "Standard Login", "SSO Login", "2FA Login" };

		for (int i = 0; i < usernames.length; i++) {
			System.out.println("🔍 Testing for user: " + usernames[i]);

			for (int j = 0; j < loginTypes.length; j++) {
				System.out.println("   → Attempting " + loginTypes[j] + " with password: " + passwords[i]);

				// Simulate login function
				boolean result = simulateLogin(usernames[i], passwords[i], loginTypes[j]);

				if (result) {
					System.out.println("      Login successful.\n");
				} else {
					System.out.println("      Login failed.\n");
				}
			}
		}
	}

	// Simulated login logic (randomly returns true or false for demonstration)
	private static boolean simulateLogin(String username, String password, String loginType) {
		return Math.random() > 0.3; // 70% chance of success
	}
}
