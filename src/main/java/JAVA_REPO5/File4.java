package JAVA_REPO5;

//Program: Prime Number Checker
//Meaning: Check if a number is divisible only by 1 and itself

//If number <= 1 → not a prime
//Loop from 2 to sqrt(number)
//If number % i == 0 → number is not prime
//If no divisors found → number is prime

public class File4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Number is a Prime");
		} else {
			System.out.println("Number is not a Prime");
		}

	}

}
