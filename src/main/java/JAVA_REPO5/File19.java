package JAVA_REPO5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Find Second Largest Number in Array
//Initialize two variables for largest and second largest
//Loop through the array
//Update largest and second largest based on current value
//Return the second largest number



public class File19 {

	public static void main(String[] args) {
			
		int arr[] = {100, 50, 25, 10};
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		
		for(int a: arr)
		{
			if(a > largest)
			{
				second_largest=largest;
				largest=a;
			}
			else if(a > second_largest && a < largest)
			{
				second_largest=a;
			}
		}
		System.out.println("Largest : "+largest);
		System.out.println("Second Largest : "+second_largest);
	}

}
