package com.marolix.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReductionOperations  {
//min,max,count,reduce

	public static List<Integer> intList() {

		return Arrays.asList(1, 2, 3, 4, 44, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9808089, 45);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ReductionOperations r= new ReductionOperations();
		r.clone();
		System.out.println("enter the number");
		Integer a = new Scanner(System.in).nextInt();
		
		int sum = intList().stream().filter(b -> b == a).collect(Collectors.summingInt(s -> s));
		System.out.println("sum is " + sum);
	}

}
