package com.marolix.pack2.oops;

class Parent extends Object{
	public void m1() {
		System.out.println("this is parent m1 method");
	}

}

class Child extends Parent {
	public void m2() {
		System.out.println("this is child class m2 method");
	}
}

public class OppsDemo1 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.m1();// this is parent m1 method

		Child c = new Child();
		c.m2();// this is child m2
		c.m1();// this is parent m1
		System.out.println(c.toString());
		;
		Parent p = new Child();
		p.m1();// this is parent m1
		// p.m2();

		// Child r= new Parent();
	}

}
