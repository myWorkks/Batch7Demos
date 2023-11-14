package com.marolix.streams;

import java.util.List;

public class CountDemo {

	public static void main(String[] args) {
		List<Integer> intL = ReductionOperations.intList();
		long evenNumbers = intL.stream().filter(q -> q % 2 == 0).count();
		System.out.println("total count is " + intL.size() + " even numbers count is " + evenNumbers);
	}

}
