package com.marolix.WrapperClasses;

public class EqualityCheck {

	public static void main(String[] args) {
//	String s= new String("abc");
//	String s1= new String("abc");
//	System.out.println(s==s1);//false
//	String s2="abc";
//	String s3="abc";
//	System.out.println(s2==s3);//true

		Integer i = 10;
		Integer i1 = 10;
		System.out.println(i == i1);
		Integer i2 = new Integer(20);
		Integer i3 = new Integer(20);
		System.out.println(i2 == i3);
		Integer i4 = 100;
		Integer i5 = 100;
		System.out.println(i4 == i5);// true
		Integer i6 = 1000;
		Integer i7 = 1000;
		System.out.println(i6 == i7);//true
		Integer i8 = 127;
		Integer i9 = 127;
		System.out.println(i8 == i9);//false
		
		Float f=100f;
		Float f1=100f;
		System.out.println(f==f1);
		
	}

}
