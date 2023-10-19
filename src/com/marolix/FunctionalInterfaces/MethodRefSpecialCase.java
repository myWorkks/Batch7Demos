package com.marolix.FunctionalInterfaces;

interface FII<T> {
	String func(T a);
}

class Student {
	int a;
	int b;

	public String dummyMethod() {
		return "empty String";

	}
}

public class MethodRefSpecialCase {

	public static void main(String[] args) {

		// FII<Integer> ff = Integer::compare;
		FII<Student> fs = Student::dummyMethod;
		System.out.println(fs.func(new Student()));
		;
	}

}
