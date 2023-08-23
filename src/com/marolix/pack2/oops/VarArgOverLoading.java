package com.marolix.pack2.oops;

public class VarArgOverLoading {

//	public void display(int a) {
//		System.out.println("this is primitive parameter");
//	}

//	public void display(Integer a) {
//		System.out.println("this is wrapper parameter");
//	}
//	public void display(long a) {
//		System.out.println("this is autopromotion parameter");
//	}

	public void display(int... a) {
		System.out.println("this is vararg parameter");
	}

	public static void main(String[] args) {
		VarArgOverLoading vv = new VarArgOverLoading();
		vv.display(0);
	}

}
