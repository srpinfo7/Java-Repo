package JAVA_REPO5;

//Program: Even or Odd Checker
//Meaning: Determine if a number is even (divisible by 2) or odd

//If number % 2 == 0 → number is even
//Else → number is odd

public class File9 {

	public static void main(String[] args) {

		checkEvenOrOdd(12);
		checkEvenOrOdd(13);
		checkEvenOrOdd(45);
		checkEvenOrOdd(97);
		checkEvenOrOdd(66);

	}

	public static void checkEvenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is Even");
		} else {
			System.out.println(number + " is Odd");
		}
	}

}
