package JAVA_REPO;

//Factorial of a number

public class File6 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7;
		int fact = 1;

		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num +" is "+fact );
	}

}
