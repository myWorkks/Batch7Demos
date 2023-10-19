package com.marolix.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InstanceCreationDemo {

	public String dummyMethod(String a) {
		return "";
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		for (int j = 1; j <= list.size(); j++) {
			System.out.println(j * j);
		}

		List<String> str = Arrays.asList("apple", "banana", "cat", "dog");
		System.out.println("22" + str);
		for (int i = 0; i < str.size(); i++) {
			String s = str.get(i);
			s = s.toUpperCase();
			str.set(i, s);
		}
		System.out.println("28" + str);

		Stream<String> stream = str.stream();// got stream instance

		// Function f =t -> t.toLowerCase()
		stream = stream.map(t -> {
			System.out.println(" 30 line printing string in map " + t);
			return t.toLowerCase();
		});
		// intermediate operation

		str = stream.collect(Collectors.toList());// terminal operation
		System.out.println("37  " + str);
	}

}
