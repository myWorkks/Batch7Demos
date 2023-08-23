package com.marolix.ExceptionHAndling;

public class AbnormalTerminationDemo {
	public static void m2(int a, int b) {
		System.out.println("this is m2 method");
		System.out.println(a / b);
		System.out.println("this is end of m2");
	}

	public static void m1(int a, int b) {
		System.out.println("this is m1");
		m2(a, b);
		System.out.println("end of m1");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		m1(10, 0);
		System.out.println("end of main");
	}

}
