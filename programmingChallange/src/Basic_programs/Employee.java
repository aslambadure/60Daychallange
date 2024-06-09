package com;

public class Employee {
	int age;
	String name;

	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return age + "" + name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
