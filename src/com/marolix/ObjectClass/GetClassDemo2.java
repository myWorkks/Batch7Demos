package com.marolix.ObjectClass;

import java.lang.reflect.Method;

class USerDefined {

	int a;

	USerDefined() {
	}

//	public String toString() {
//		return "a is " + a;
//	}

	void m1() {
	}

	@Override
	public String toString() {
		return "USerDefined [a=" + a + "]";
	}

	void m2() {
	}

	void m3() {
	}
}

public class GetClassDemo2 {

	public static void main(String[] args) {
		USerDefined u = new USerDefined();
		System.out.println(u);
		String s = u.toString();
		System.out.println(s);

		Class c = u.getClass();
		System.out.println(c.getName());
		System.out.println(c.getPackageName());
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			System.out.println(m1);
		}
	}

}
