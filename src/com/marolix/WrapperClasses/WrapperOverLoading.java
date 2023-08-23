package com.marolix.WrapperClasses;

public class WrapperOverLoading {

	void m1(Float l) {
		System.out.println("float");
	}

	void m1(Long l) {
		System.out.println("primitive long");
	}

	public static void main(String[] args) {
		WrapperOverLoading w = new WrapperOverLoading();
		Integer a = 10;//autoboxing
		//w.m1(a);//auto unboxing

	}

}
