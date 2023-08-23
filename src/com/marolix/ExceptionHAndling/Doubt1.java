package com.marolix.ExceptionHAndling;

public class Doubt1 {

	public static void main(String[] args) {
		System.out.println("main");
		try {
			System.out.println("outer try");
			System.out.println(10 / 0);
			try {
				System.out.println("inner try");
				int[] a = new int[2];
				a[2] = 20;
				System.out.println("end of inner try");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("end of outer try ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");

	}

}
