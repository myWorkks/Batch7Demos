package com.marolix.pack2.oops;

class Parent1 {

	public void study() {

		System.out.println("study first enjoy later");
	}
}

class Child1 extends Parent1 {
	public void study() {

		System.out.println("enjoy first study later");
	}

}

public class OverridingDemo {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.study();
		Child1 c = new Child1();
		c.study();
		Parent1 p1 = new Child1();
		p1.study();
	}

}
