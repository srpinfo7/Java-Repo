package JAVA_REPO5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Count Occurrences of Each Character in String
//Initialize a Map to store character and their count
//Loop through each character in the string
//If character exists in Map, increment its count
//Else, add character to Map with count 1
//Return the Map with character counts


public class File14 {

	public static void main(String[] args) {
		String str="Sameer Ranjan Panda";
		HashMap<Character,Integer> stringChars=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(stringChars.containsKey(ch))
			{
				if(stringChars.get(ch)!=null)
				{
					stringChars.put(ch, stringChars.get(ch)+1);
				}				
			}
			else
			{
				stringChars.put(ch,1);
			}
		}
		
		System.out.println(stringChars);
	}

}
