package com.marolix.pack2.oops;

public class NativeOverridingDemo {
public int hashCode() {
	System.out.println("non native");
	return 1;
}
public static void main(String[] args) {
	Object O= new NativeOverridingDemo();
	O.hashCode();
}
}
