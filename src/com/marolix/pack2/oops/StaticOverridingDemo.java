package com.marolix.pack2.oops;
class Static{
	public static void m1() {
		System.out.println("parent class m1");
	}
	public static void main(String[] args) {
		System.out.println("parent main");
	}
	
}
public class StaticOverridingDemo  extends Static{
	public static void m1() {
		System.out.println("parent class m1");
	}
	public static void main(String[] args) {
		System.out.println("child main");
	
		Static s= new StaticOverridingDemo();
		s.main(args);
		Static.m1();
	}
}
