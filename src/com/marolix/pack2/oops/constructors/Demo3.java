package com.marolix.pack2.oops.constructors;

public class Demo3 {

	private static Demo3 d = null;

	private Demo3() {
		System.out.println("calling constructor");
	}

	public static Demo3 generateInstance() {

		if (d == null) {

			d=new Demo3();
			return d;
		} else {
			return d;

		}
	}

}

class Dummy {
	public static void main(String[] args) {
		System.out.println("creating object of Singleton");

		Demo3 d = Demo3.generateInstance();
		System.out.println(d.hashCode());
		Demo3 d2 = Demo3.generateInstance();
		System.out.println(d2.hashCode());
	}
}