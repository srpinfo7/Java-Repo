package JAVA_REPO5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Reverse Each Word in a Sentence
//Split the sentence into words using space as delimiter
//Initialize empty StringBuilder for result
//Loop through each word, reverse it, and append to result
//Return the final sentence with reversed words



public class File15 {

	public static void main(String[] args) {
		String str="Sameer Ranjan Panda";
		StringBuilder result=new StringBuilder();
		
		String splitArr[]=str.split(" ");
		
		for(int i=0;i<splitArr.length;i++)
		{
			String arr=splitArr[i];
			for(int j=arr.length()-1;j>=0;j--)
			{
				result.append(arr.charAt(j));
			}
			result.append(" ");
			
		}
		
		System.out.println(result);
		
	}

}
