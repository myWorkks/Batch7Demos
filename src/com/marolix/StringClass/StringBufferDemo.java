package com.marolix.StringClass;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer();
		System.out.println(s.length());//0
		System.out.println(s.capacity());//16
		StringBuffer sb2= new StringBuffer("abc");
		System.out.println(sb2.length());//3
		System.out.println(sb2.capacity());//19
		StringBuffer sb3= new StringBuffer(70);
		System.out.println(sb3.length());//0
		System.out.println(sb3.capacity());//70
		
		StringBuffer sb4= new StringBuffer(new String());

	}

}
