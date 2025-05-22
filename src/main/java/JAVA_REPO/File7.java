package JAVA_REPO;

// Reverse a String

public class File7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="Automation Testing";
		String reverse="";
				
		for(int i=text.length()-1;i>=0;i--)
		{
			reverse+=text.charAt(i);
		}
		System.out.println(reverse);
	}

}
