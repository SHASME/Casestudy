package collections;

import java.util.ArrayList;
import java.util.Collections;

public class School {
ArrayList<Student> studentList;
public void sortByName() {
	Collections.sort(studentList,new Sorting());
}
public double getAvgPercentage() {
	double sum=0;
	for (int i = 0; i <studentList.size(); i++) {
    sum	= sum +	studentList.get(i).getPercentage();
	}
	return sum/studentList.size();
}
}
