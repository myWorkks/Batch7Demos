package com.marolix.StringClass;

import java.lang.reflect.Constructor;

public class ConstructorSDemo {

	public static void main(String[] args) {
		byte [] b= {99,12,45,68};
		String s1= new String(b);
		char[] ch= {9,'a','b',89};
		String s2= new String(ch);
		System.out.println(s2+":"+s1);
		System.out.println("--------------------");
		String s = new String();
		Class c = s.getClass();
		Constructor[] cons = c.getConstructors();
		int count = 0;
		for (Constructor constructor : cons) {

			System.out.println(++count + " : " + constructor);
		}
		System.out.println("total constructors " + count);
	}

}
