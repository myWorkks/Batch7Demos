package com.marolix.WrapperClasses;

public class XxxValueMethod {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(1000);
		Integer ii = Integer.valueOf("10");
		int a=1000;
		byte bbb=(byte)a;
		System.out.println(a+" "+bbb);
		int p1=i.intValue();
		short s=i.shortValue();
		float f= i.floatValue();
		byte b=i.byteValue();
		
		System.out.println(i+" " +b);
		// Integer ii2= new Integer("ten");
		System.out.println(i + "," + ii);

		Character ch = Character.valueOf('j');
		// Character ch2=new Character("j");
		System.out.println(ch.charValue());

		Boolean ba = Boolean.valueOf(false);
		
		ba.booleanValue();
		Boolean b1 = Boolean.valueOf("false");
		Boolean b2 = Boolean.valueOf("TruEe");
		System.out.println(b + "," + b2);


	}

}
