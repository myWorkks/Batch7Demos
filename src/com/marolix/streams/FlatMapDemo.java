package com.marolix.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	public class Employee {
		Integer empId;
		Float salary;
		String name;
		String adhaar;
		List<String> phoneNumbers;

		public Employee(Integer empId, String name, String adhaar, List<String> phoneNumbers) {
			super();
			this.empId = empId;
			this.name = name;
			this.adhaar = adhaar;
			this.phoneNumbers = phoneNumbers;
		}

		public Employee() {
			super();
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", adhaar=" + adhaar + ", phoneNumbers="
					+ phoneNumbers + "]";
		}

	}

	public static List<Employee> empList() {
		FlatMapDemo fm = new FlatMapDemo();
		Employee e1 = fm.new Employee(1, "bharath", "789456123147", Arrays.asList("8899778899"));
		Employee e2 = fm.new Employee(2, "sharath", "879456123147", Arrays.asList("8899778899", "4645646141"));
		Employee e3 = fm.new Employee(3, "ram", "7894523147", Arrays.asList("887788899"));
		Employee e4 = fm.new Employee(4, "shyam", "879123623147", Arrays.asList("8898528899", "4963646141"));

		return Arrays.asList(e1, e2, e3, e4);
	}

	public static void main(String[] args) {
		List<Employee> empList = empList();
		System.out.println(empList);
		List<String> allPhone = new ArrayList<String>();
		System.out.println(allPhone);
		// empList.stream().map(e -> e.adhaar).forEach(a -> System.out.println(a));
//		empList.stream().map(e -> e.phoneNumbers).forEach((List<String> t) -> {
//			t.stream().forEach(t1 -> allPhone.add(t1));
//		});
		empList.stream().flatMap(t->t.phoneNumbers.stream()).forEach(t->System.out.println(t));
		//System.out.println(allPhone);
	}

}
