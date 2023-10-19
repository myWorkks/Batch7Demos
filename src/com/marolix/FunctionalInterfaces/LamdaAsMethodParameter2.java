package com.marolix.FunctionalInterfaces;

@FunctionalInterface
interface FIDemo1 {
	String doFunc(String s);
}

public class LamdaAsMethodParameter2 {

	static String convertToUpperCase(FIDemo1 f, String s) {
		return f.doFunc(s);
	}

	static String reverseString(FIDemo1 f, String s) {
		return f.doFunc(s);
	}

	public static void main(String[] args) {
//		FIDemo1 f = (String s) -> s.toUpperCase();
		String s = convertToUpperCase((String s1) -> s1.toUpperCase(), "bharath");
		System.out.println(s);

//		FIDemo1 f2 = (String str) -> {
//			String rev = "";
//			for (int i = str.length() - 1; i >= 0; i--) {
//				rev += str.charAt(i);
//			}
//			return rev;
//		};

		String reversed = reverseString((String str) -> {
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev += str.charAt(i);
			}
			return rev;
		}, "bharath");
		System.out.println(reversed);
	}

}
