package com.marolix.streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	private class Employee {
		Float salary;
		String name;
		LocalDate doj;

		Employee() {
		}

		public Employee(Float salary, String name, LocalDate doj) {
			super();
			this.salary = salary;
			this.name = name;
			this.doj = doj;
		}

		@Override
		public String toString() {
			return "Employee [salary=" + salary + ", name=" + name + ", doj=" + doj + "]";
		}

	}

	public static List<Employee> employeeList() {
		FilterDemo fd = new FilterDemo();
		return Arrays.asList(fd.new Employee(30000f, "shiva", LocalDate.of(2023, 05, 20)),
				fd.new Employee(25000f, "venkatesh", LocalDate.of(2023, 05, 12)),
				fd.new Employee(20000f, "sreenath", LocalDate.of(2023, 05, 05)));
	}

	public static void main(String[] args) {
		List<Employee> empList = employeeList();
		System.out.println(empList);
//predicate
//based on salaray
		empList.stream().filter((Employee e) -> e.salary > 20000f).forEach(e -> System.out.println(e));
	//exp todays date-doj
	
	}

}
