package com.marolix.Collections;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.util.List");
		Method[] m = c.getDeclaredMethods();
//		for (int i = 0; i < m.length; i++) {
//			System.out.println(i + 1 + " : " + m[i]);
//		}

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println("simple list object : " + l);
		l.add(2, 77);
		// l.add(2, 77);java.lang.IndexOutOfBoundsException
		System.out.println("after setting 77 : " + l);
		l.set(2, 99);
		System.out.println("after setting 99 : " + l);

		Collection<Integer> coll = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			coll.add(7 * i);
		}
		System.out.println("new coll obj " + coll);

		l.addAll(0, coll);
		System.out.println("after adding coll : " + l);

		System.out.println(l.contains(7));

		Collection<Integer> searchColl = new ArrayList<Integer>();
		searchColl.add(1);
		searchColl.add(200);
		System.out.println("search collection : " + searchColl);
		System.out.println("contins All : " + l.containsAll(searchColl));
		

	}

}
