package JAVA_REPO4;
//While loop example

import java.io.File;
import java.net.Socket;

public class File2 {

	public static void main(String[] args) {
		String host = "localhost";
		int port = 8094;
		long startTime = System.currentTimeMillis();
		long timeOut = 10;
		
		boolean isServiceUp=false;

		while ((System.currentTimeMillis() - startTime) < timeOut * 1000) {
			try(Socket socket=new Socket(host,port))
			{
				System.out.println("Service is Running in the port "+port);
				isServiceUp=true;
				break;
			}
			catch (Exception e) {
				System.out.println("Waiting for the Service to up on "+port+"....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			

		}
		
		if(!isServiceUp)
		{
			System.out.println("Service is not Running on port:"+port+" till Timeout");
		}
		
		

	}

}
