package com.marolix.pack2.oops;

class VarArg {
	public void m1(int... x) {
		System.out.println("this is var arg method");
	}
}

public class VarArgOveridingDemo extends VarArg {
	public void m1(int  x) {
		System.out.println("this is normal method");
	}

	public static void main(String[] args) {
		VarArg v = new VarArgOveridingDemo();
		v.m1(1);
	}
}
