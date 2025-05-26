package JAVA_REPO6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		String formattedDate = sf.format(cal.getTime());
		System.out.println(cal.toString());
		System.out.println(formattedDate);

	}

}
