package com.marolix.pack2.oops;

public class OverloadingCase1 {
	public static void display(int a) {
		System.out.println("this is int display");
	}

	public static void display(float a) {
		System.out.println("this is float display");
	}

	public static void main(String[] args) {

		display(0);// this is int display
		display(0f);// this is float dispaly
//display('1');
	}

}
