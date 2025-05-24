package JAVA_REPO3;

//LinkedList` – Task Queue for Background Jobs
import java.util.LinkedList;

public class file18 {
	
	public static void main(String args[]) {
		LinkedList<String> tasks=new LinkedList<String>();
		
		tasks.add("Send email");
		tasks.add("Print Reports");
		tasks.add("Archieve Logs");
		tasks.add("Update Database");
		tasks.add("Send notifications to user");
		
		while(!tasks.isEmpty())
		{
			System.out.println("Processing: "+tasks.removeFirst());
		}

		
	}

}
