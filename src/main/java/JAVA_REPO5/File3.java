package JAVA_REPO5;

//Program: Factorial Calculation
//Meaning: Find the factorial of a number (n!) → product of all positive integers up to n

//Initialize result = 1
//Loop from 1 to n
//Multiply result by loop variable each time (result *= i)
//After loop ends, result holds the factorial



public class File3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fact=1;
		
		for (int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial is: "+fact);
		

	}

}
