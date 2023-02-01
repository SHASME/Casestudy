package collections;

public class Attendence {
public String checkRecord(String str) {
	str = str.toUpperCase();
	int count =0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='A') {
			 count ++;
		}
		if(count>1) {
			break;
		}
		
	}
	if(count >1) {
		return "Not Eligible";
	}
	else {
		return "Eligible";
	}
}
}
