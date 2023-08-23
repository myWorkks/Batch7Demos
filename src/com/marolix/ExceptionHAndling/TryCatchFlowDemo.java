package com.marolix.ExceptionHAndling;

public class TryCatchFlowDemo {

	public static void main(String[] args) {
		System.out.println("main method");
		try {
			System.out.println("try block");
			System.out.println(10 / 0);
			System.out.println("end of try");
		} catch (Exception e) {
			System.out.println("in catch block");
		}
		System.out.println("after ctach block");

	}

}
