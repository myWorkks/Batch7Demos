package com.marolix.FunctionalInterfaces.inbuilt;

import java.util.function.Consumer;

interface SRP<T> {
	void srp(T t);
}

//interface Consumer<T>{
// void accept(T t);
//}
public class ConsumerDemo {

	public static void main(String[] args) {
		SRP<Integer> s = (Integer i) -> System.out.println(i);
		s.srp(45);

		Consumer<String> ss = s1 -> System.out.print(s1);
		ss.accept("bharath");
	}

}
