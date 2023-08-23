package com.marolix.Collections;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class c = Class.forName("java.util.Collection");
//		Method[] m = c.getDeclaredMethods();
//		for (int i = 0; i < m.length; i++) {
//
//			System.out.println((i + 1) + "  :  " + m[i]);
//		}

		Collection<Integer> c = new ArrayList<Integer>();
		// adding elements
		c.add(1);
		c.add(2);
		// c.add(10.0);
		c.add(3);
		System.out.println(c.toString());
		System.out.println(c.size());
		System.out.println(c.remove(10));
		Collection<Integer> c2 = new ArrayList<Integer>();
		c2.add(1);
		c2.add(2);
		System.out.println(c2);
		// c.removeAll(c2);
		System.out.println(c);
		// c.clear();
		System.out.println(c);
		Object[] o = c.toArray();
		c.retainAll(c2);
		System.out.println(c);

	}

}
