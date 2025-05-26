package JAVA_REPO5;

//Program: Armstrong Number Checker
//Meaning: A number is Armstrong if sum of its digits raised to power of total digits equals the number

//Store original number in temp variable
//Count number of digits (loop by dividing by 10)
//Reset number, loop through each digit
//Raise digit to power of count and add to sum
//After loop, if sum == original number → it's an Armstrong number


public class File5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 154;
		int temp;
		int digits=0;
		int sum=0;
		temp=num;
		while(temp > 0)
		{
			temp=temp/10;
			digits++;
		}
		
		temp=num;
		
		while(temp > 0)
		{
			int val=temp%10;
			sum=sum+(int)Math.pow(val, digits);
			temp=temp/10;			
		}
		

		if (num==sum) {
			System.out.println("Number is a Armstrong");
		} else {
			System.out.println("Number is not a Armstrong");
		}

	}

}
