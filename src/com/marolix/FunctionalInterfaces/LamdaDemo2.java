package com.marolix.FunctionalInterfaces;

interface FI {

	void m1();
	// void m2(); thhis is not possible

	static void m2() {
		System.out.println("thi is static m2 method");

	}

	default void m3() {
		System.out.println("this is default m3 methd");
	}
}

public class LamdaDemo2 {

	public static void main(String[] args) {
		FI fi = () -> System.out.println("this is impl of m1 using lamda");
		System.out.println(fi.getClass().getName());
		fi.m1();
		FI.m2();
		fi.m3();

	}

}
