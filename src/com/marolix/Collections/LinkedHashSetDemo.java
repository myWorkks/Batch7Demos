package com.marolix.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(1);
		h.add(200);
		h.add(20);
		h.add(20);
		System.out.println(h);
	}

}
