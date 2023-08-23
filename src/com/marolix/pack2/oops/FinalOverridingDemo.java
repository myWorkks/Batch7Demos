package com.marolix.pack2.oops;

class Final {

	public  void m1() {
		System.out.println("this is parent fial method");
	}
}

public class FinalOverridingDemo extends Final {
	public final void m1() {
		System.out.println("this is child fial method");
	}

	public static void main(String[] args) {

	}

}
