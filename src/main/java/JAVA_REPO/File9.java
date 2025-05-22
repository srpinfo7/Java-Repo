package JAVA_REPO;

//  Sorting logic

public class File9 {

	public static void main(String[] args) {
		int[] arr= {20,67,98,34,7,5,23,888,567,987};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for (int i : arr) System.out.print(i + " ");
	}

}
