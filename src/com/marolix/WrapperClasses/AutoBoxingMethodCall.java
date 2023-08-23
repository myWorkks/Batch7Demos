package com.marolix.WrapperClasses;

public class AutoBoxingMethodCall {
	static int a = 10;
	static int b;
	static Integer c = 100;
	static Integer d;

	public static void main(String[] args) {
		Integer a = AutoBoxingMethodCall.a;
		// Integer a=10
		System.out.println(a);// 10
		Integer b = AutoBoxingMethodCall.b;
		System.out.println(b);// 0
		int c = AutoBoxingMethodCall.c;// 
		//int c=c.intValue();
		//int c=100
		System.out.println(c);// 100
		int d = AutoBoxingMethodCall.d;
		//int d= d.intValue()
		//int d=null.inVAlue();
		System.out.println(d);//
	}

}
