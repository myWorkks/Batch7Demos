package com.marolix.Collections;

import java.util.Comparator;
import java.util.TreeSet;

class EmpComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		MyStringComp m = new MyStringComp();
		return m.compare(o1.getEmpName(), o2.getEmpName());
	}

}

public class TreeSetDemoUserDefined {

	public static void main(String[] args) {
		Comparator<Employee> empCOmp = new EmpComp();
		TreeSet<Employee> ts = new TreeSet<Employee>(empCOmp);
		ts.add(new Employee(1000, "bharath"));
		ts.add(new Employee(400, "sharath"));
		ts.add(new Employee(30, "charan"));
		ts.add(new Employee(1000, "bharath"));
		System.out.println(ts);
	}

}
