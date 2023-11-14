package com.marolix.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MinAndMaxDemo {

	public static void main(String[] args) {
		List<Integer> intList = ReductionOperations.intList();
		System.out.println(intList);//replace max with min min and max purely works on the index after sorting it wont check the value
		Optional<Integer> optional = intList.stream().max((Integer x, Integer y) -> x.compareTo(y));
		int a = optional.get();
		System.out.println(a);
	}
}
