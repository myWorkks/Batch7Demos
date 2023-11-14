package com.marolix.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
	public static List<Integer> intList() {
		return Arrays.asList(1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 657, 8, 9, 0);
	}

	public static List<String> stringlist() {
		String main = "I am bharath reddy,I am java developer";
		List<String> list = new ArrayList<String>();
		for (String s : main.split(" ")) {
			list.add(s);
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> l = intList().stream().map(t -> t * t * t).filter(t -> t % 2 == 0).collect(Collectors.toList());

		System.out.println(l);
CharSequence ch= "prefix ";
CharSequence ch2=" suffix";
		String finalS = stringlist().stream().map(s -> s.toUpperCase())
				.collect(Collectors.joining("-",ch,ch2 ));

		System.out.println(finalS);
	}

}
