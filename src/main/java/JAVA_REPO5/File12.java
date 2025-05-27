package JAVA_REPO5;

import java.util.HashSet;

//Remove Duplicate Characters from String
//Initialize empty String to store result
//Use a Set to keep track of seen characters
//Loop through each character of the input string
//If character is not in Set, add it to Set and append to result string
//Return the result string


public class File12 {

	public static void main(String[] args) {
		String OriginalStr="What a busy day.";
		StringBuilder result=new StringBuilder();
		
		HashSet<Character> st=new HashSet<Character>();
		
		for(int i=0;i<OriginalStr.length();i++)
		{
			char c=OriginalStr.charAt(i);
			if(!st.contains(c))
			{
				st.add(c);
				result.append(c);
			}			
		}
	
		System.out.println(result);
	}

}
