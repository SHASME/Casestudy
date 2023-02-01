package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCollections {
public static void main(String[] args) {
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	set.add("shashi");
	set.add("shashi");
	set.add("srusti");
	set.add("kumar");
	set.add("kajal");
	set.add("puneet");
	Iterator<String> itr =set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
