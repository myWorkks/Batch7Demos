package com.marolix.FunctionalInterfaces;

;



public class InnerClassAccessDemo {

	public static void main(String[] args) {
		
		
		InnerClassDemo icd = new InnerClassDemo();
		InnerClassDemo.B1 b1 = icd.new B1();
		// b1.m1();
		InnerClassDemo.B5 b5 = new InnerClassDemo.B5();
		// b5.m1();

		InnerClassDemo.B2 b2 = icd.new B2() {

			@Override
			public void m2() {
				System.out.println("this is m2 overriden in anonymous inner class");

			}
		};

		InnerClassDemo.B2 b21 = icd.new B2() {

			@Override
			public void m2() {
				System.out.println("this is m2 overriden in anonymous inner class");

			}
		};
		InnerClassDemo.B2 b22 = icd.new Base();
		InnerClassDemo a = new InnerClassDemo();

		System.out.println(a);
		System.out.println(b1);
		System.out.println(b5);
		System.out.println(b2);
		;
		System.out.println(b21);
		System.out.println(b22);
	}
}
