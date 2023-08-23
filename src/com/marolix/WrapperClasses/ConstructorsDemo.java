package com.marolix.WrapperClasses;
class A {}
public class ConstructorsDemo {

	public static void main(String[] args) {
		int a=10;
		
		A a1 = new A();
		
		System.out.println(a1);
		
		
		Integer i= new Integer(10);
		Integer ii=new Integer("10");
		//Integer ii2= new Integer("ten");
		System.out.println(i+","+ii);
		
		
		Character ch= new Character('j');
		//Character ch2=new Character("j");
		System.out.println(ch);
		
		Boolean b= new Boolean(false);
		Boolean b1= new Boolean("false");
		Boolean b2= new Boolean ("TruEe");
		System.out.println(b+","+b2);

	}

}
