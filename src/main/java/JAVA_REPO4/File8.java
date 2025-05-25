package JAVA_REPO4;

//Inverted Pyramid
public class File8 {
	public static void main(String[] args) {
		int row = 5;

		for (int i = row; i >= 1; i--) {
			// Print leading spaces
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			// Move to the next line
			System.out.println();
		}
	}
}
