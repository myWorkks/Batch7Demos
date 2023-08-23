package com.marolix.pack2;

public class CartImpl implements Cart {
	public double addToCart() {
		return 0;
	}

	public String modifyCart() {
		return null;
	}

	public String deleteFromCart() {
		return null;
	}

	public void classMethod() {
	}

	public static void main(String[] args) {
		CartImpl c = new CartImpl();
		c.addToCart();
		c.modifyCart();
		c.deleteFromCart();
		c.classMethod();

		Cart c1 = new CartImpl();
		c1.addToCart();
		c1.modifyCart();
		c1.deleteFromCart();
//		c1.classMethod();
		c1.m1();
		Cart.m2();
		//c1.m3();
	}

	public void m3() {
		// TODO Auto-generated method stub
		
	}
}
