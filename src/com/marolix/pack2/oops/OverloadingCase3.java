package com.marolix.pack2.oops;

public class OverloadingCase3 {
	public static void display(long l) {
		System.out.println("this is primitive long method");
	}

	public static void display(Integer n) {
		System.out.println("this is integer method");
	}

	public static void main(String[] args) {

		display(1);
	}

}
