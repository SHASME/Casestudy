package strings;

public class StringUpperLower {
public static void main(String[] args) {
	String s="shashi";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s);
	// trim a method
	System.out.println(s);
	System.out.println(s.trim());
	// starsWith and endWith
	System.out.println(s.startsWith("s"));
	System.out.println(s.endsWith("h"));
   //The String class charAt() method returns a character at specified index.
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(5));
	//The String class length() method returns length of the specified String.
	System.out.println(s.length());
}
}
