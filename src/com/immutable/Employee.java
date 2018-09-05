package com.immutable;

public class Employee {

	private final int id;
	private final String name;

	public Employee(int id, String string) {
		super();
		this.id = id;
		this.name = string;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
