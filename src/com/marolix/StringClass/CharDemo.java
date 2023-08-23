package com.marolix.StringClass;

public class CharDemo {

	public static void main(String[] args) {
		String s="abc@#";
		System.out.println(s.length());
		System.out.println(s.charAt(1));
	byte[] b=	s.getBytes();
	for (byte c : b) {//comments
		System.out.print(c);
		char ch=(char)c;
		System.out.print(ch);
	}
		System.out.println();
char[] charr= s.toCharArray();
System.out.println(charr);

s.getChars(0, 0, charr, 0);
	}

}
