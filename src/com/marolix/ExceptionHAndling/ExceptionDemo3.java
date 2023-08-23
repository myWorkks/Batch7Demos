package com.marolix.ExceptionHAndling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo3 {

	public static void main(String[] args) {
//		if(false) {
//			
//			
//		}
		try {
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
		}
		System.out.println("after try and catch");
	}

}
