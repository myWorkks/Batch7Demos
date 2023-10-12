package com.marolix.FunctionalInterfaces;

interface I {

	void m1();

	void m2();
}

public class LamdaDemo1 implements I {
	@Override
	public void m1() {
		System.out.println("this is m1 method");

	}

	@Override
	public void m2() {
		System.out.println("this is m1 method");

	}

	public static void main(String[] args) {
		I i = new LamdaDemo1();
		i.m1();
		i.m2();
		// creating I instance with anonymous inner class

		class Inner implements I {

			@Override
			public void m1() {
			}

			@Override
			public void m2() {
			}
		}
		I i2 = new Inner();
		I i1 = new I() {

			@Override
			public void m1() {

			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub

			}
		};
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
	}

}
