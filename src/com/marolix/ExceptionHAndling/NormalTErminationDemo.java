package com.marolix.ExceptionHAndling;

public class NormalTErminationDemo {
	public static void m4() {
		System.out.println("this is m4 method");

		System.out.println("m4 execution is done");
	}

	public static void m3() {
		System.out.println("this is m3 method");
		m4();
		System.out.println("m3 execution is done");
	}

	public static void m2() {
		System.out.println("this is m2 method");
		m3();
		System.out.println("m2 execution is done");
	}

	public static void m1() {
		System.out.println("this is m1 method");
		m2();
		System.out.println("m1 execution is done");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		m1();
		System.out.println("main method execution is done");
	}

}
