package JAVA_REPO4;

//Payramid Triangle Structure
public class File7 {
	public static void main(String[] args) {
		int row = 5;

		for (int i = 1; i <= row; i++) {
			// Print Spaces
			for (int j = i; j < row; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i -1); k++) {
				System.out.print("*");				
			}
			
			System.out.println(" ");
		}

	}
}
