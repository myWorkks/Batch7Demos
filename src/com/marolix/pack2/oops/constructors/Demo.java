package com.marolix.pack2.oops.constructors;

public class Demo {

	int a;
	int b;
	int c;

//	Demo() {
//		super();
//		System.out.println("this is a parameter less constructor");
//	}

	public Demo(int p, int q, int r) {
		System.out.println("parameerized constructor");
		a = p;
		b = q;
		c = r;
	}

	public Demo(int p) {
		System.out.println("1 parameerized constructor");
		a = p;

	}

	public void initialiseVariables(int p, int q, int r) {
		a = p;
		b = q;
		c = r;
	}

	public static void main(String[] args) {
//		Demo d1 = new Demo();
//		Demo d2=new Demo();
		Demo d = new Demo(10, 12, 13);
		// d.initialiseVariables(10, 12, 13);
		System.out.println(d.a + " " + d.b + " " + d.c);
	}

}
