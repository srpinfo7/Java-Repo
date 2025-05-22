package JAVA_REPO;

// Check Pallindrome

public class File8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="madam";
		String reverse="";
				
		for(int i=text.length()-1;i>=0;i--)
		{
			reverse+=text.charAt(i);
		}
		
		if(text.equals(reverse))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
	}

}
