package com.marolix.FunctionalInterfaces.inbuilt;

import java.util.Scanner;
import java.util.function.Predicate;

interface PQR<T> {
	boolean abc(T t);
}
//
//interface Predicate<T> {
//	boolean test(T t);
//}

public class PredicateDemo {

	public static void main(String[] args) {
		PQR<String> p = s -> true;
		System.out.println(p.abc("abc"));
		PQR<Integer> i = ii -> ii > 80;
		System.out.println(i.abc(85));
		PQR<Object> o = op -> op instanceof String;
		System.out.println(o.abc(1));
		Predicate<Integer> p1 = t -> t > 18;
		int age = new Scanner(System.in).nextInt();
		System.out.println("age " + age + "is " + (p1.test(age) ? " elgible" : " not elgible"));
	}

}
