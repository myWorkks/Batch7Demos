package com.marolix.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		// add all
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3 }));
//int ->Integer
		// int[] ->Integer[]
		System.out.println(l);
		Collections.addAll(l, new Integer[] { 1, 2, 3 });
		System.out.println(l);
	}

}
