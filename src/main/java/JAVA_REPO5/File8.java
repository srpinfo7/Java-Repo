package JAVA_REPO5;

//Program: Swap Two Numbers (without using temp)
//Meaning: Exchange values of two variables using arithmetic

//a = a + b
//b = a - b
//a = a - b



public class File8 {

	public static void main(String[] args) {

		int a = 20;
		int b = 56;
		
		System.out.println("After Swap Value of a and b are: "+ a+" & "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap Value of a and b are: "+ a+" & "+b);
		
	}

	
}
