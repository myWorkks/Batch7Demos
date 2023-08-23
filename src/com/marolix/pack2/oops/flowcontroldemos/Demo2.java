package com.marolix.pack2.oops.flowcontroldemos;

public class Demo2 {
	int a;
	String b;
	{
		System.out.println("this is static block 1");
	}
	{
		System.out.println("thi sis static block 2");
		m1();
	}
	Demo2(){
		System.out.println("constructor called");
	}
	public static void main(String[] args) {
		
		System.out.println("main metod startrs");
		Demo2 d = new Demo2();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println("main method ends");
	}

	public void m1() {

		System.out.println(a);
		System.out.println(b);

	}

	{
		System.out.println("this is static block 3");
	}
	{
		System.out.println("this is static block 4");
	}

}
