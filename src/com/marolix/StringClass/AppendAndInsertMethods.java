package com.marolix.StringClass;

public class AppendAndInsertMethods {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb.append(false);//false
		sb.append('c');//falsec
		sb.append("string");//falsecsrting
		sb.append(new Object());//falsecstringreference
		System.out.println(sb);
		
		sb.insert(2, " I am inserting in btween ");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 15);
		System.out.println(sb);

	}

}
