package com.marolix.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedMethodDemo {
	class Bike implements Comparable<Bike> {
		String name;
		Float mileage;

		Bike() {
		}

		Bike(String name, Float mileage) {
			this.mileage = mileage;
			this.name = name;
		}

		@Override
		public int compareTo(Bike o) {
			return this.mileage.compareTo(o.mileage);

		}

		@Override
		public String toString() {
			return "Bike [name=" + name + ", mileage=" + mileage + "]";
		}

	}

	static int i = 0;

	public static List<String> stringList() {
		String s = "I am bharath. I am a java developer";
		String ss[] = s.split(" ");
		return Arrays.asList(ss);
	}

	public static List<Bike> bikeList() {
		SortedMethodDemo sd = new SortedMethodDemo();
		return Arrays.asList(sd.new Bike("pulsar", 45f), sd.new Bike("splender", 60f), sd.new Bike("FZ", 40f));
	}

	public static void main(String[] args) {
		List<String> strings = stringList();
		System.out.println(strings);
		Stream<String> stream = strings.stream().sorted();
		System.out.println(strings);

		stream.forEach((String s) -> {
			// System.out.println("index " + i);
			strings.set(i, s);
			i++;
		});
		System.out.println(strings);
//

		List<Bike> bikes = bikeList();
		System.out.println(bikes);
		bikes.stream().sorted().forEach(b -> System.out.println(b));
		// comparTo
		System.out.println("sorting with comparator");
		//Comparator<Bike> c = (b1, b2) -> -1 * b1.mileage.compareTo(b2.mileage);
		bikes.stream().sorted((b1, b2) -> -1 * b1.mileage.compareTo(b2.mileage)).forEach(b -> System.out.println(b));
	}

}
