package com.marolix.ExceptionHAndlinling.Questions;

import java.sql.SQLException;

public class Question5 {

	public static void main(String[] args) {
		try {
			System.out.println(10);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
