package strings;

public class StringBufferEx {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("Hello");
	StringBuffer s2 = new StringBuffer("Java");
	
	StringBuffer s1 = s.append(s2);
	System.out.println(s.toString());
}
}
