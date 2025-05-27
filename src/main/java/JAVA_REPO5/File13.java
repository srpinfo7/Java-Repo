package JAVA_REPO5;

import java.util.Arrays;
import java.util.HashSet;

//Check if Two Strings are Anagrams
//Remove all whitespace and convert both strings to lowercase
//Convert both strings to character arrays
//Sort both character arrays
//Compare the sorted arrays
//If equal, the strings are anagrams



public class File13 {

	public static void main(String[] args) {
		String str1="Listen";
		String str2="Silent";
		
		str1=str1.trim();
		str2=str2.trim();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] sta1=str1.toCharArray();
		char[] sta2=str2.toCharArray();
		
		Arrays.sort(sta1);
		Arrays.sort(sta2);
		
		
		if(Arrays.equals(sta1, sta2))
		{
			System.out.println("anagrams");
		}
		else
		{
			System.out.println("Not anagrams");
		}
		

	}

}
