package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {
public static void main(String[] args) {
	TreeSet<String> set = new TreeSet<String>();
	set.add("Ravi");  
	set.add("Vijay");  
	set.add("Ravi");  
	set.add("Ajay");  
	set.add("Shashi");
	set.add("Vijay");  
	Iterator<String> itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
