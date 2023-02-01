package collections;

public class Student {
private String name;
private float percentage;
public Student( String name,float percentage) {
	super();
	this.name=name;
	this.percentage=percentage;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPercentage() {
	return percentage;
}
public void setPercentage(float percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "{"+this.name+","+this.percentage+"}";
	
}
}
