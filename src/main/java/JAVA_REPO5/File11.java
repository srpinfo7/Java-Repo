package JAVA_REPO5;

//Program: Find Largest and Smallest Number in Array
//Meaning: Identify max and min values in a given array of numbers

//Initialize max = arr[0], min = arr[0]
//Loop through each element of the array
//If element > max → update max
//If element < min → update min

public class File11 {

	public static void main(String[] args) {
		int nums[]= {23,45,11,1222,4,233,56,983,27};
		int max=nums[0];
		int min=nums[0];
		
		for(int num: nums)
		{
			if(num > max)
			{
				max=num;
			}
			
			if(num < min)
			{
				min=num;
			}
		}
		
		System.out.println("Max and Min of the given array are: "+max +" & "+min);

	}

}
