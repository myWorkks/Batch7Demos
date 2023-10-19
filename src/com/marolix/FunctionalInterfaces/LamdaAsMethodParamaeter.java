package com.marolix.FunctionalInterfaces;

class Dummy {
	void m1(int a) {
		System.out.println("int");
	}

	void m1(String s) {
		System.out.println("strig");
	}

	void m1(CharSequence s) {
		System.out.println("char sequence");
	}

	void m1(Dog d) {
		System.out.println("dog");
	}

	void m1(Animal a) {
		System.out.println("animal called");
	}
}

@FunctionalInterface
interface Animal {

	void func();
}

class Dog {
}

public class LamdaAsMethodParamaeter {

	public static void main(String[] args) {
		Dummy d = new Dummy();
		d.m1(1);
		String s = "abc";
		d.m1(s);
		d.m1("abc");
		d.m1(new String("abc"));
		CharSequence cs = "hbjhqjhf";
		d.m1(cs);
		Dog dog = new Dog();
		d.m1(dog);
//		Animal a = new Animal() {
//
//			@Override
//			public void func() {
//				System.out.println("function");
//				
//			}
//		};
		Animal a = () -> System.out.println("fi abstract method impl");
		d.m1(a);

		d.m1(new Animal() {

			@Override
			public void func() {

			}
		});
		d.m1(()->System.out.println("lamda as method paraeter"));

	}

}
