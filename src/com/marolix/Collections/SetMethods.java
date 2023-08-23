package com.marolix.Collections;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("java.util.Set");
		Method[] m = c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println(i + 1 + " : " + m[i]);
		}
		Collection<Integer> coll = new ArrayList<Integer>();

		coll.add(1);
		coll.add(2);
		Set<Integer> copyOfSetElements = Set.copyOf(coll);
	//	copyOfSetElements.add(4);
		System.out.println(copyOfSetElements);

		Thread.currentThread().stop();
		Set<Integer> s = new TreeSet<Integer>();
		System.out.println(s);
		System.out.println(s.add(1));
		System.out.println(s.add(2));
		System.out.println(s);
		System.out.println(s.add(20));
		System.out.println(s.add(0));
		System.out.println(s.add(0));
		System.out.println(s);
		System.out.println(s.add(null));
	}

}
