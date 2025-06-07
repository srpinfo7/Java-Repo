package JAVA_REPO5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Check if Array is Sorted
//Loop through the array from index 0 to length-2
//Compare current element with the next one
//If current is greater than next, array is not sorted
//If loop completes without issues, array is sorted

public class File22 {

	public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};  // Try changing this to test other cases

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("Array is sorted in ascending order.");
        } else if (descending) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
