package com.marolix.ExceptionHAndling;

public class FullyCheckedException {

	public static void main(String[] args) {
		try {

			System.out.println("this is try block");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("after catch");

	}

}
