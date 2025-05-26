package JAVA_REPO5;

//Program: Reverse String or Number
//Meaning: Reverse the characters in a string or digits in a number

//For string:
//Convert to char array or use charAt()
//Loop from end to start, append characters to reverse string

//For number:
//While number > 0:
//Get last digit using % 10
//Append to reversed = reversed * 10 + digit
//Remove last digit using / 10

public class File6 {

	public static void main(String[] args) {

		getReverse(1988);
		getReverse("I love Coding");
	}

	public static void getReverse(String original) {
		String reverse = "";
		for (int i = original.length()-1; i >= 0; i--) {
			reverse += original.charAt(i);
		}
		System.out.println("Reverse string is: " + reverse);
	}
	
	public static void getReverse(int original) {
		int reverse=0;
		while(original>0)
		{
			int val=original%10;
			reverse=reverse*10+val;
			original=original/10;
		}
		System.out.println("Reverse number is: " + reverse);
	}
}
