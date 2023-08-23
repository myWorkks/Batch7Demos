package com.marolix.ExceptionHAndlinling.Questions;

public class Question3 {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			int a[] = { 1, 2, 3 };
			System.out.println(a[0]);
			System.out.println(a[3]);
		} catch (ArrayStoreException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
	}

}
