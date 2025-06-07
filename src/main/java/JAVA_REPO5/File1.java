package JAVA_REPO5;


//Palindrome Checker (String or Number)
//Initialize empty string for reverse
//Loop through original string from end to start, build reversed string
//Compare reversed string with original (ignore case if needed)
//If equal  it's a palindrome

public class File1 {

	static String original = "HelleH";
	static String reverse = "";

	public static void main(String[] args) {
		boolean isPalindrome = checkPalindrome(original);
		if (isPalindrome) {
			System.out.println("This is a Palindrome");
		} else {
			System.out.println("Not a Pallindrome");
		}

	}

	public static boolean checkPalindrome(String original) {
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			return true;
		}
		return false;
	}
}
