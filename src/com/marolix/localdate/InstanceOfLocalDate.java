package com.marolix.localdate;

import java.time.LocalDate;
import java.time.Month;
//
//enum A {
//	a2(10), a3;
//
//	A() {
//	}
//
//	A(int a) {
//		System.out.println("constructor called");
//	}
//}
//
////class A {
////
////	final static A a2 = new A();
////}

public class InstanceOfLocalDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1999, 9, 13);
		System.out.println("date is " + date);
		LocalDate date2 = LocalDate.of(1999, Month.SEPTEMBER, 13);
		System.out.println("date is " + date2);

		LocalDate today = LocalDate.now();
		System.out.println("todays date is " + today);

		LocalDate dayAfter4days = today.plusDays(4);
		System.out.println(dayAfter4days);
	LocalDate dd=	today.minusDays(450);
System.out.println(dd);
	}

}
