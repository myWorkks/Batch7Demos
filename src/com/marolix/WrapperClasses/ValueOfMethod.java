package com.marolix.WrapperClasses;

public class ValueOfMethod {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		Integer ii = Integer.valueOf("10");
		// Integer ii2= new Integer("ten");
		System.out.println(i + "," + ii);

		Character ch = Character.valueOf('j');
		// Character ch2=new Character("j");
		System.out.println(ch);

		Boolean b = Boolean.valueOf(false);
		Boolean b1 = Boolean.valueOf("false");
		Boolean b2 = Boolean.valueOf("TruEe");
		System.out.println(b + "," + b2);

	}

}
