package JAVA_REPO6;

public class ExceptionTest {
    public static void main(String[] args) {
        String testCase = "LoginTest";
        String[] testSteps = {"Launch browser", "Navigate to URL", null, "Enter Password", "Click login"};

        try {
            System.out.println("Starting test case: " + testCase);

            for (int i = 0; i < testSteps.length; i++) {
                System.out.println("Executing step: " + testSteps[i].toUpperCase());
            }

            System.out.println("Test case executed successfully!");

        } catch (NullPointerException e) {
            // Handle a scenario where a test step is not defined
            System.out.println("Error: A test step is missing. Details: " + e.getMessage());

        } catch (Exception e) {
            // General exception catch for safety
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // Simulate cleanup like closing browser or logging results
            System.out.println("Cleaning up test resources...");
            System.out.println("Test run completed (with or without errors).");
        }
    }
}

