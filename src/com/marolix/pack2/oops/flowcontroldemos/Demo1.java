package com.marolix.pack2.oops.flowcontroldemos;

public class Demo1 {
	static int a;
	static String b;
	static {
		System.out.println("this is static block 1");
	}
	static {
		System.out.println("thi sis static block 2");
		Demo1.m1();
		Demo1 d= new Demo1();
	}
public Demo1() {
	System.out.println("thiis is constructor");
}
	public static void main(String[] args) {
		Demo1 d= new Demo1();
		System.out.println("main metod startrs");
		System.out.println(a);
		System.out.println(b);
		System.out.println("main method ends");
	}

	public static void m1() {

		System.out.println(a);
		System.out.println(b);

	}

	static {
		System.out.println("this is static block 3");
	}
	static {
		System.out.println("this is static block 4");
	}

}
