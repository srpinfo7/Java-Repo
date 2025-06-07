package JAVA_REPO5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Find Missing Number in an Array (Assuming 1 to n with one missing)
//Calculate expected sum using formula n*(n+1)/2
//Calculate actual sum by iterating through the array
//Subtract actual sum from expected sum to get the missing number


public class File21 {

	public static void main(String[] args) {
        // Example: Array of numbers from 1 to 10, but 7 is missing
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10}; // missing 7

        int n = arr.length + 1; // because one number is missing

        // Step 1: Calculate expected sum using formula n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate actual sum from the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Step 3: Subtract actual from expected to get the missing number
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
        
}
