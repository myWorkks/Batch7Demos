package com.marolix;

public class CharArrayTest {

	public static void main(String[] args) {
		String s1 = new String("aardvark");
		String s2 = new String("aardvark");
//		System.out.println(s1 .hashCode() );
//		System.out.println(s2 .hashCode() );
		Float f = new Float(3.14f);
		if (f > 3) {
			System.out.print("pi is bigger than 3. ");
		} else {
			System.out.print("pi is not bigger than 3. ");
		}

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
