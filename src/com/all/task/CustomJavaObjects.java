package com.all.task;

import java.util.ArrayList;
import java.util.Collections;

public class CustomJavaObjects {

	public static void main(String[] args) {

		ArrayList<Student> l = new ArrayList<>();

		l.add(new Student(1, "vinaysai"));
		l.add(new Student(10, "ks"));
		l.add(new Student(0, "vinaysa"));
		l.add(new Student(9, "vinays"));
		l.add(new Student(1, "vina"));
		l.add(new Student(8, "v"));
		l.add(new Student(1, "vin"));
		l.add(new Student(9, "vi"));
		System.out.println(l);
		Collections.sort(l, new CompareId());
		System.out.println(l);

		Collections.sort(l, new CustomSort());
		System.out.println(l);
	}

}
