package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollections {
public static void main(String[] args) {
	ArrayList<String> str = new ArrayList<String>();
	str.add("Shashi");
	str.add("kUMAR");
	str.add("srusti");
	Iterator itr = str.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
