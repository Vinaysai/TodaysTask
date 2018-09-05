package com.immutable;

public class Immutable {

	public static void main(String[] args) {

		ImmutableObject obj = new ImmutableObject(1, new Employee(1, "Vinaysai"));

		System.out.println(obj.getId() + "::" + obj.getObj());

	}
}
