package com.marolix.FunctionalInterfaces;

interface FI1 {
	String revString(String str);
}

public class ReverseStringLAmda {

	public static void main(String[] args) {
		FI1 f = (String s) -> {
			// new StringBuffer(s).reverse().toString();
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			return sb.toString();
		};
		FI1 f2= s-> new StringBuffer(s).reverse().toString();
		String rev = f.revString("Bharath");
		System.out.println(rev);
		rev = f2.revString("RAjesh");
		System.out.println(rev);

	}

}
