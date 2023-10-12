package com.marolix.Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(200);
		h.add(20);
		System.out.println(h.add(20));

		System.out.println(h);

	}

}
