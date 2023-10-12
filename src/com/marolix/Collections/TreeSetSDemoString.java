package com.marolix.Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyStringComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		Integer l1 = o1.length();
		Integer l2 = o2.length();
		return -1*(l1 > l2 ? +1 : (l1 < l2 ? -1 : o1.compareTo(o2)));
	}

}

public class TreeSetSDemoString {

	public static void main(String[] args) {
		Comparator<String> cs = new MyStringComp();
		TreeSet<String> ts = new TreeSet<String>(cs);
		ts.add("zebra");
		ts.add("umberalla");
		ts.add("bat");
		ts.add("van");
		ts.add("apple");
		System.out.println(ts);
	}

}
