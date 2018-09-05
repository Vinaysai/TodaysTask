package com.all.task;

import java.util.Comparator;

public class CustomSort implements Comparator<Student> {

	
	
	//Comparing Using String
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
