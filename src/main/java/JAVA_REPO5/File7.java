package JAVA_REPO5;

//Program: Swap Two Numbers (using temp variable)
//Meaning: Exchange values of two variables using a third variable

//temp = a
//a = b
//b = temp


public class File7 {

	public static void main(String[] args) {

		int a = 8;
		int b = 9;
		int temp;
		
		System.out.println("After Swap Value of a and b are: "+ a+" & "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swap Value of a and b are: "+ a+" & "+b);
	}

	
}
