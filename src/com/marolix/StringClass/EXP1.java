package com.marolix.StringClass;

import java.util.ArrayList;

public class EXP1 {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		System.out.println(a);
		String s = "";
		System.out.println("before for");
//		for (long i = 0; i <= a + 1; i++) {
//			System.out.println("inside for");
//			s = s + i;
//		}
		ArrayList<String> l = new ArrayList<String>();
		
		for (long i = 0; i <= a ; i++) {
			//System.out.println("array list for looop");
			l.add(i + "");
		}
		System.out.println(l);
		while (l.listIterator().hasNext()) {
			String sss = l.listIterator().next();
			s=s+sss;
		}
		System.out.println(s);
		System.out.println("after for");

	}

}
