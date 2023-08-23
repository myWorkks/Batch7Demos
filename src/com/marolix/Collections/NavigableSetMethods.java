package com.marolix.Collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(2);
		ns.add(1);
		ns.add(13);
		ns.add(7);
		ns.add(6);
		ns.add(9);
		System.out.println(ns);
		System.out.println("celing of 6 is " + ns.ceiling(6));// 6
		System.out.println("celing of 8 is " + ns.ceiling(8));// 9
		System.out.println("higher of 6 is " + ns.higher(6));// 6
		System.out.println("higher of 8 is " + ns.higher(9));// 13
//floor
		System.out.println("floor of 6 is " + ns.floor(6));// 6
		System.out.println("floor of 8 is " + ns.floor(8));// 7
		System.out.println("lower of 6 is " + ns.lower(6));// 2
		System.out.println("lower of 8 is " + ns.lower(8));// 7

		Iterator<Integer> i = ns.iterator();

		while (i.hasNext()) {

			int a = i.next();
			System.out.println(a);
		}
//		for (Integer i1 : ns) {
//			System.out.println(i1);

//		}
		Iterator<Integer> di = ns.descendingIterator();
		while (di.hasNext()) {
			int a = di.next();
			System.out.println(a);
		}
		System.out.println("before calling descending set " + ns);
		ns = ns.descendingSet();
		System.out.println("after calling descending set method" + ns);

		System.out.println("poll first method " + ns.pollFirst());
		System.out.println(ns);
		System.out.println("poll last method " + ns.pollLast());
		System.out.println(ns);
		System.out.println("headset method " + ns.headSet(7));
		System.out.println("headset method with boolean " + ns.headSet(7, true));
		System.out.println("tailset method " + ns.tailSet(7));
		System.out.println("tailset method with boolean " + ns.tailSet(7, false));

		System.out.println("subset " + ns.subSet(7, 6));
		System.out.println("subset with boolean conditions for limits" + ns.subSet(7, false, 6, true));
	}

}
