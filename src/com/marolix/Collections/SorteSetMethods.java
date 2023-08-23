package com.marolix.Collections;

import java.lang.reflect.Method;
import java.util.SortedSet;
import java.util.TreeSet;

public class SorteSetMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.util.SortedSet");
		Method[] m = c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			// System.out.println(i + 1 + " : " + m[i]);
		}
		SortedSet<Integer> s = new TreeSet<Integer>();
		s.add(2);
		s.add(0);
		s.add(1);
		s.add(7);
		s.add(6);
		s.add(8);
		s.add(12);
		s.add(11);
		s.add(9);
		System.out.println(s);
		System.out.println("fetching first element : " + s.first());
		System.out.println("fetching last element : " + s.last());
		System.out.println("head set elements befor 8 : " + s.headSet(8));
		System.out.println("tail set elements befor 8 : " + s.tailSet(8));
//		System.out.println("head set elements befor 8 : " + s.headSet(10));
//		System.out.println("tail set elements befor 8 : " + s.tailSet(10));

		System.out.println("sub set elements : " + s.subSet(2, 11));
		// System.out.println("sub set elements : " + s.subSet(3, 10));
	}

}
