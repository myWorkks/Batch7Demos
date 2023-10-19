package com.marolix.FunctionalInterfaces.inbuilt;

import java.util.function.Supplier;

import com.marolix.Collections.Employee;

interface XYZ<R> {
	R pqr();
}

//interface Supplier<R> {
//	R get();
//}

public class SupplierDemo {

	public static void main(String[] args) {
		XYZ<Employee> x = () -> new Employee();
		System.out.println(x.pqr());
		XYZ<String> x1 = () -> new String("java");
		System.out.println(x1.pqr());
		Supplier<String> s = () -> "Taraining";
		System.out.println(s.get());

	}

}
