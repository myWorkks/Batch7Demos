package com.marolix.ExceptionHAndlinling.Questions;

import java.sql.SQLException;

public class Question2 {

	public static void main(String[] args) {

		try {

			System.out.println("try block");

			System.out.println(10 / 0);

			int[] a = new int[5];

			System.out.println(a[0]);
			;

			System.out.println(a[5]);

		}

		catch (RuntimeException e) {

			System.out.println(e.getMessage());

		}

		catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		System.out.println("after try");

	}

}
