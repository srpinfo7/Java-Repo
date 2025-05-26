package JAVA_REPO5;

//Program: Sum of Digits
//Meaning: Find the total sum of individual digits of a number

//Initialize sum = 0
//While number > 0:
//Get last digit using % 10
//Add digit to sum
//Remove last digit by dividing number by 10


public class File10 {

	public static void main(String[] args) {

		sumOfDigits(223412);
		sumOfDigits(1223);
		sumOfDigits(445);
		sumOfDigits(97);
		sumOfDigits(66);

	}

	public static void sumOfDigits(int number) {
		int sum=0;
		while(number>0)
		{
			sum+=number%10;
			number=number/10;
		}
		System.out.println("Sum of digits is : "+sum);
	}

}
