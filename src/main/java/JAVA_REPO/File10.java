package JAVA_REPO;

//  Find Largest Element in Array

public class File10 {

	public static void main(String[] args) {
		int[] arr= {20,67,98,34,7,5,23,888,567,987};
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				largest=arr[i];
			}
		}
		
		System.out.println("Largest: "+largest);
	}

}
