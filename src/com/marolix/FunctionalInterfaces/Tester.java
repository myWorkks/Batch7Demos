package com.marolix.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Tester {
	public static void main(String args[]) {
		List<Employee> empList = Arrays.asList(new Employee("Raja", 15000), new Employee("Adithya", 12000),
				new Employee("Jai", 9000), new Employee("Ravi", 19000), new Employee("Surya", 8500),
				new Employee("Chaitanya", 7500), new Employee("Vamsi", 14000));
		FII<Employee> getEmployeeNameFunction = Employee::getName;
		System.out.println("The list of employees whose salary greater than 10000:");
		empList.stream().filter(e -> e.getSalary() > 10000).map(Employee::getName) // instance method reference
																					// "getName" using class name
																					// "Employee"
				.forEach(e -> System.out.println(e));
	}
}

// Employee class
class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
}
