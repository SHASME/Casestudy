package strings;

public class StringComparation {
public static void main(String[] args) {
	String s="shashi";
	String s1="shashi";
	String s2=new String(s);
	String s4="srusti";
	System.out.println(s.equals(s1));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s4));
	System.out.println(s1.equalsIgnoreCase(s2));
	//by using equal operator
	System.out.println(s1==s4);
	System.out.println(s==s1);
	// by using compareTo method
    System.out.println(s.compareTo(s1));
    System.out.println(s1.compareTo(s4));
    System.out.println(s.compareTo(s2));
}
}
