package com.marolix.pack2.oops.flowcontroldemos;

public class Demo5 {
	public Demo5() {
		System.out.println("parent constructor");
	}

	int a;
	String b;
	{
		System.out.println("thi sis static block 1");
		System.out.println(a);
		System.out.println(b);
	}

	{
		System.out.println("static block 2");
		a = 1;
		b = "omeString";
	}

	public static void main(String[] args) {
		System.out.println("main metod");
		Demo5 d = new Demo5();

	}

	{
		System.out.println("static block 3");
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo6 extends Demo5 {
	public Demo6() {
		System.out.println("child constructor");
	}

	int a;
	String b;
	{
		System.out.println(super.a);
		System.out.println("thi sis chid static block 1");
		System.out.println(a);
		System.out.println(b);
	}

	{
		System.out.println("static child block 2");
		a = 1;
		b = "omeString";
	}

	public static void main(String[] args) {
		System.out.println("main  child metod");
		Demo6 d = new Demo6();
	}

	{
		System.out.println("static child block 3");
		System.out.println(a);
		System.out.println(b);
	}
}
