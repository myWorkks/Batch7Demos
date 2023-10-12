package com.marolix.Collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
//		if (o1 < o2)
//			return +1;
//		else if (o1 > o2)
//			return -1;
//		else
//			return 0;
//		return -1*(o1.compareTo(o2));
		return o2.compareTo(o1);
	}
}

public class TreeSetDemoInteger {

	public static void main(String[] args) {
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(7);
//		ts.add(9);
//		ts.add(1);
//		ts.add(20);
//		ts.add(14);
//		ts.add(6);
//		System.out.println(ts);
		// compartor
		Comparator<Integer> c = new MyComp();
		TreeSet<Integer> ts = new TreeSet<Integer>(c);
		ts.add(7);
		ts.add(9);
		ts.add(1);
		ts.add(20);
		ts.add(14);
		ts.add(6);
		System.out.println(ts);
	}

}
