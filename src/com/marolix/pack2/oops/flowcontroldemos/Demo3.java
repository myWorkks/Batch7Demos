package com.marolix.pack2.oops.flowcontroldemos;

public class Demo3 {
	static int a;
	static String b;
	static {
		System.out.println("thi sis static block 1");
		System.out.println(a);
		System.out.println(b);
	}

	static {
		System.out.println("static block 2");
		a = 1;
		b = "omeString";
	}

	public static void main(String[] args) {
		System.out.println("main metod");

	}

	static {
		System.out.println("static block 3");
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo4 extends Demo3{
	static int a;
	static String b;
	static {
		System.out.println("thi sis chid static block 1");
		System.out.println(a);
		System.out.println(b);
	}

	static {
		System.out.println("static child block 2");
		a = 1;
		b = "omeString";
	}

	public static void main(String[] args) {
		System.out.println("main  child metod");

	}

	static {
		System.out.println("static child block 3");
		System.out.println(a);
		System.out.println(b);
	}
}
