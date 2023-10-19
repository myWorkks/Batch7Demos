package com.marolix.FunctionalInterfaces;

interface StaticFi<T> {
	T doSomething(int a, int b);
}

public class StaticMethodReferenceDemo {

	public StaticMethodReferenceDemo() {
		super();
	}

	public StaticMethodReferenceDemo(int a, int b) {
		System.out.println(a + ":" + b);
	}

//	static int sum(int a, int b) {
//
//		return a + b;
//	}

	int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
//	StaticFi sf = (a, b) -> a + b;
		// StaticFi sf = StaticMethodReferenceDemo::sum;
		StaticFi<Integer> sf = LamdaDemo1::sum;
		int b = sf.doSomething(2, 3);
		System.out.println(b);

//		StaticFi sf1 = (a1, a2) -> a1 * a2;
		StaticMethodReferenceDemo srrd = new StaticMethodReferenceDemo();
		StaticFi<Integer> sf1 = srrd::multiply;
		int mul = sf1.doSomething(8, 9);
		System.out.println(mul);

		StaticFi<StaticMethodReferenceDemo> sf2 = StaticMethodReferenceDemo::new;
		StaticMethodReferenceDemo d = sf2.doSomething(10, 15);
		System.out.println(d);
	}

}
