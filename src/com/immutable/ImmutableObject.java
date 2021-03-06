package com.immutable;

public class ImmutableObject {

	private final int id;
	private final Employee obj;

	public ImmutableObject(int id, Employee obj) {
		super();
		this.id = id;
		this.obj = obj;
	}

	public int getId() {
		return id;
	}

	public Employee getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "ImmutableObject [id=" + id + ", obj=" + obj + "]";
	}

}
