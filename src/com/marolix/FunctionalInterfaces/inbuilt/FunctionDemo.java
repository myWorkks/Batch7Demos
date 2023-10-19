package com.marolix.FunctionalInterfaces.inbuilt;

import java.util.function.Function;

interface Abc<T, R> {
	R xyz(T t);
	// int xyz(int)
	// int xyz(String)
	// Double xyz(String)
}

//interface Function<T, R> {
//	R apply(T t);
//}

public class FunctionDemo {

	public static void main(String[] args) {

		Abc<Integer, Integer> a = (Integer a1) -> {
			return a1;
		};
		int b = a.xyz(1);
		System.out.println(b);

		Abc<String, Integer> a1 = (String a2) -> a2.length();
		System.out.println(a1.xyz("JAva"));

		Abc<String, Double> a2 = (String s3) -> {
			Integer len = s3.length();
			return len.doubleValue();
		};
		// int->double
		// Integer->Double
		System.out.println(a2.xyz("Applee"));

		Abc<Object, Number> a3 = (Object o) -> 1l;
		// Object xyz(Object)
		System.out.println(a3.xyz(null));

		Function<String, Integer> fun = (s) -> 1;
		System.out.println(fun.apply(new String()));
	}
//FUnction<T,R> R apply(T t)
}
