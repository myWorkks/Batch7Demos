package com.marolix.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInstance {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			list.add(i);
		}
		System.out.println(list);

		// stream ()
		Stream<Integer> stream = list.stream();
		stream.forEach((Integer t) -> System.out.print(t + " "));
		// streams are not reusable
		// stream.forEach((Integer t) -> System.out.print(t + " "));
		System.out.println();
		Stream<Integer> pstream = list.parallelStream();
		pstream = pstream.sequential();
		pstream.forEach((Integer t) -> System.out.print(t + " "));

		// Arrays.stream
		Stream<Integer> arstream = Arrays.stream(new Integer[] { 1, 2, 3, 4 });
	}

}

//19 18 21 20 16 17 15 9 24 10 29 27 25 26 8 13 12 23 4 1 28 11 6 5 14 0 2 3 22 7 
//19 18 21 20 16 17 15 27 26 29 28 23 4 22 13 24 25 1 0 3 6 5 9 7 11 14 10 12 8 2