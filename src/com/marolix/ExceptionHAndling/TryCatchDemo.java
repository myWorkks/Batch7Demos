package com.marolix.ExceptionHAndling;

public class TryCatchDemo {

	public static void main(String[] args) {
		String s = "java.lang.Strings";
		try {
			Class.forName(s);
			System.out.println("class loaded");
		}
		// System.out.println();
		catch (Exception e) {
			// System.out.println("check the name with " + s + " class");
			// System.out.println(e.toString());
			 e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}

}
