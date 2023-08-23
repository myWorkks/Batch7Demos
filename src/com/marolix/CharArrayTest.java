package com.marolix;

public class CharArrayTest {

	public static void main(String[] args) {
		String s = "  I am bharath     ";
		char ch[] = s.toCharArray();
		int starting_index = 0;
		System.out.println(s);
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {
				starting_index = i;
				break;
			}
		}

		s = s.substring(starting_index);
		System.out.println(s);
	}

}
