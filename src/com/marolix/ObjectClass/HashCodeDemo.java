package com.marolix.ObjectClass;

class Employee {
	int empId;
	String name;
	float salary;

	public Employee() {
		super();

	}

	public Employee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int hashCode() {
		return this.empId;
	}

}

public class HashCodeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "bharath", 500.0f);
		System.out.println(e1.hashCode());
		Employee e2 = new Employee(2, "sharath", 600.0f);
		System.out.println(e2.hashCode());

	}

}
