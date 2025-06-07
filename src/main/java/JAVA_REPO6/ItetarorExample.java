package JAVA_REPO6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ItetarorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("One"); list.add("Two");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}
		
		//-------------------------------------
		
		HashSet<String> set = new HashSet<>();
		set.add("A"); set.add("B");
		Iterator<String> it1 = set.iterator();
		while (it1.hasNext()) {
		    System.out.println(it1.next());
		}

		//-------------------------------------
		Queue<String> queue = new LinkedList<>();
		queue.add("Job1"); queue.add("Job2");
		Iterator<String> it2 = queue.iterator();
		while (it2.hasNext()) {
		    System.out.println(it2.next());
		}
		
		//---------------------------------------
		Map<String, String> map = new HashMap<>();
		map.put("env", "QA");
		map.put("browser", "Chrome");

		Iterator<Map.Entry<String, String>> it3 = map.entrySet().iterator();
		while (it3.hasNext()) {
		    Map.Entry<String, String> entry = it3.next();
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}



	}

}
