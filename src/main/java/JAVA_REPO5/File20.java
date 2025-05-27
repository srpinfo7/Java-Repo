package JAVA_REPO5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Merge Two Arrays
//Initialize a new array with combined length of both arrays
//Copy elements from the first array to new array
//Then copy elements from the second array to new array
//Return the merged array


public class File20 {

	public static void main(String[] args) {
			
		int arr1[] = {100, 50, 25, 10};
		int arr2[] = {3,5,23,45};
		int mergedArray[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			mergedArray[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			mergedArray[arr1.length+i]=arr2[i];
		}
		
		for(int a:mergedArray)
		{
			System.out.print(" "+a);
		}
		
	}

}
