package com.marolix.StringClass;

public class EnsureCapacityDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("bharath reddy");
		// capacity=29
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		// capcity size>2*curentcpaty+2
		// 100>2*19+2
		// 100>40
		System.out.println(sb.capacity());
		sb.ensureCapacity(203);
		// 150>2*100+2
		// 150>202
		// false => as it is false it will ensureCaacity to 2*cc+2=202
		System.out.println(sb.capacity());
		sb.trimToSize();

		System.out.println(sb.capacity());
		sb.setLength(2000);
		System.out.println(sb.capacity());
		char ch[]= new char[sb.length()];
		sb.getChars(0, sb.length(), ch, 0);
		System.out.println(ch);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
