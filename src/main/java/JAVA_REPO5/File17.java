package JAVA_REPO5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Sort an Array without using sort()
//Use a sorting algorithm like Bubble Sort or Selection Sort
//Loop through the array with nested loops
//Compare and swap elements to arrange them in order
//Continue until the array is fully sorted


public class File17 {

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
