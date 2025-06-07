package JAVA_REPO5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Find Duplicate Elements in an Array
//Initialize a Set to track seen elements
//Initialize another Set to store duplicates
//Loop through array elements
//If element is already in seen Set, add to duplicate Set
//Return the duplicate Set or list

public class File16 {

	public static void main(String[] args) {
		int[] elements = { 1, 4, 5, 6, 7, 4, 3, 4, 65, 5, 2, 2, 4, 45, 454, 2, 2, 3 };
		HashSet<Integer> element = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();

		for (int a : elements) {
			if (element.contains(a)) {
				duplicate.add(a);
			} else {
				element.add(a);
			}
		}
		System.out.println("Duplicate Elements Present in Array: " + duplicate);
	}

}
