package com.marolix.ExceptionHAndling;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			 throw new ArithmeticException("");
//			int[] a = new int[1];
//			a[1] = 20;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index");
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception");
		} finally {
			System.out.println("this is finally block");
		}

	}

}
