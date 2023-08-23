package com.marolix;

import com.marolix.pack2.ImplicitDemo;

public class VariablesDemo {

	transient int a;
	static String b;
	{

		System.out.println(a);

	}

	public static void main(String[] args) {

		ImplicitDemo i = new ImplicitDemo();
		i.display();

		Thread.currentThread().stop();
		final int aa = 2;
		// System.out.println(a);
		int bb;
//		aa=10;
//		aa=20;

		VariablesDemo d = new VariablesDemo();
		VariablesDemo d1 = new VariablesDemo();
		bb = d.a;// 0
		System.out.println(d.a + " " + VariablesDemo.b);
		d.a = 10;
		d.b = "sreenath reddy";
		System.out.println(d.a + " " + d.b);
		System.out.println(d1.a + " " + d1.b);
	}

}
