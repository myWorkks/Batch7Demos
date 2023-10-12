package com.marolix.FunctionalInterfaces;

interface FI2 {

	Object doSomething();

}

public class TwoIstancesLamda {

	public static void main(String[] args) {
		FI2 f1 = () -> "bharath";
		FI2 f2 = () -> 256.0f;

		System.out.println(f1.doSomething());
		System.out.println(f2.doSomething());

	}

}
