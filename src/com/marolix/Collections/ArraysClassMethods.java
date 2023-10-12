package com.marolix.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysClassMethods {
	static class Employee implements Comparable<Employee> {
		Integer empID;

		public Employee(Integer empID) {
			super();
			this.empID = empID;
		}

		@Override
		public int compareTo(Employee o) {

			return this.empID.compareTo(o.empID);
		}

		@Override
		public String toString() {
			return "Employee [empID=" + empID + "]";
		}

	}

	class MyOwnComp implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {

			return -o1.empID.compareTo(o2.empID);
		}
	}

	public void innerClassCheck() {
		MyOwnComp my = new MyOwnComp();
	}

	public static void main(String[] args) {
		// asList

		List<String> stringList = Arrays.asList(new String[] { "ggg", "ff", "eee" });

		System.out.println(stringList);

		// sort
		int[] a = { 8, 9, 4, 2, 1, 3, -8, -2, 0 };
		Arrays.sort(a);

		for (int a1 : a) {
			System.out.print(a1 + " ");
		}

		ArraysClassMethods.Employee e1 = new ArraysClassMethods.Employee(1);
		ArraysClassMethods.Employee e2 = new ArraysClassMethods.Employee(20);
		Employee[] arr = { e1, e2 };
		Arrays.sort(arr);
		for (Employee e : arr) {
			System.out.println(e);
		}

		Arrays.sort(arr, (new ArraysClassMethods()).new MyOwnComp());
		System.out.println("employee objects after sorting with comparator");
		for (Employee ee : arr) {
			System.out.println(ee);
		}

		// binary search method

		int searchIndex = Arrays.binarySearch(a, 4);
		System.out.println("index " + searchIndex);

		int b[] = Arrays.copyOf(a, 20);
		for(int b1:b) {
			System.out.print(b1+" ");
		}
		int a1[]= {1,2,3};
		int b1[]= {3,2,1};
		int poistion=Arrays.compare(a1, b1);
		System.out.println();
		System.out.println(poistion);
		
		System.out.println("equals method "+Arrays.equals(a1, b1));;
		
	}

}
