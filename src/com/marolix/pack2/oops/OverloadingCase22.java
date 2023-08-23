package com.marolix.pack2.oops;

public class OverloadingCase22 {
	public static void m1(String s) {
		System.out.println("this is string m1");
	}

	public static void m1(Object o) {
		System.out.println("this is Object m1");
	}

	public static void main(String[] args) {
		m1("");//string m1
		Object o = new String();
		m1(o);//object m1
		Object o1 = new Integer(1);
		m1(o1);// object m1
		m1(null);//strig m1
	}

}
