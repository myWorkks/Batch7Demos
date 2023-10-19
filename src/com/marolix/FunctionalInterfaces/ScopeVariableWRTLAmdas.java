package com.marolix.FunctionalInterfaces;

interface FFF<T> {
	T func(T t);
}

public class ScopeVariableWRTLAmdas {

	int a;

	static int b = 4;

	public static void main(String[] args) {

		int c = 0;
		ScopeVariableWRTLAmdas obj = new ScopeVariableWRTLAmdas();
		FFF<Integer> f = (i) -> {
			// c=c*c;
			return c;
		};
		int a = f.func(5);
		System.out.println(b);
	}

}
