package JAVA_REPO4;
//While loop example

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		String filePath = "C:/Users/Avenger/Downloads/Book3.xlsx";
		File file = new File(filePath);

		int timeoutInSeconds = 30;
		long startTime = System.currentTimeMillis();

		while ((System.currentTimeMillis() - startTime) < timeoutInSeconds * 1000) {
			if (file.exists()) {
				System.out.println("File found: " + file.getName());
				break;
			} else {
				System.out.println("Waiting for file...");
				try {
					Thread.sleep(1000); // Wait 1 second before checking again
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		if (!file.exists()) {
			System.out.println("File not found within timeout.");
		}
	}

}
