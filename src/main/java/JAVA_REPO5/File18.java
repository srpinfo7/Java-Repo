package JAVA_REPO5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Sort an Array without using sort()
//Use a sorting algorithm like Bubble Sort or Selection Sort
//Loop through the array with nested loops
//Compare and swap elements to arrange them in order
//Continue until the array is fully sorted


public class File18 {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,23,55,532,223,8};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int a=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=a;				}
			}
		}
		for(int a:arr)
		{
			System.out.print(" "+a);
		}
	}

}
