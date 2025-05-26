package JAVA_REPO5;

//Program: Fibonacci Series Generator
//Meaning: Print a series where each number is the sum of the two preceding ones

//Initialize first two numbers a = 0, b = 1
//Print a and b
//Loop from 3rd term to nth term
//Inside loop: next = a + b
//Print next
//Update a = b, b = next


public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7;
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for (int i=2;i<=number;i++)
		{
			int next=a+b;
		  System.out.print(" "+next);
		  a=b;
		  b=next;
		}
		

	}

}
