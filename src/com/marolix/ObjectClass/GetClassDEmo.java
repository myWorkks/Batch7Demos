package com.marolix.ObjectClass;

import java.lang.reflect.Constructor;

public class GetClassDEmo {
	public static void main(String[] args) {
		String s = "";
		Class c = s.getClass();
	String classname=	c.getName();
	System.out.println(classname+" :"+c.getPackageName());
	
		Constructor cc[] = c.getDeclaredConstructors();
		int count =0;
		for (Constructor constructor : cc) {
			++count;
			System.out.println(constructor);
		}
		System.out.println("total constructors is :"+count);
	}
}
