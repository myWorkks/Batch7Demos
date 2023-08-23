package com.marolix.pack2;

public interface Cart {
	public abstract double addToCart();

	public String modifyCart();

	String deleteFromCart();

	default void m1() {
	}

	static void m2() {
	}
	private void m3() {}
	
	
}
