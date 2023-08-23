package com.marolix.StringClass;

public class GetCharMethodDemo {

	public static void main(String[] args) {
		String s="abcdefghij";
		char[] newChar=new char[5];
		System.out.println(newChar);
		s.getChars(3, s.length()+1, newChar, 0);
		System.out.println(newChar);

	}

}
