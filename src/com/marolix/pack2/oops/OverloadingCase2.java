package com.marolix.pack2.oops;

public class OverloadingCase2 {
	public static void display(Number n) {
		System.out.println("this is Nummber display");
	}

	public static void display(Object o) {
		System.out.println("this is Object display");
	}

	public static void main(String[] args) {
		display(new Integer(1));//
		display(new Object());
		display(null);

	}

}
