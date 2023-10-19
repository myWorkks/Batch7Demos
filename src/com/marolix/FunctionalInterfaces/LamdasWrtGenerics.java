package com.marolix.FunctionalInterfaces;

interface FIG1 {

	void display(String s);
}

interface FIG2 {

	void display(Integer s);
}

interface FIG<T> {
	void display(T a);
}

public class LamdasWrtGenerics {

	public static void main(String[] args) {
		FIG1 f1 = (String s) -> System.out.println(s.toUpperCase());
		f1.display("bharath");
		FIG2 f2 = (Integer a) -> System.out.println(a * a);

		f2.display(new Integer(1));
		f2.display(1);
		FIG<Integer> fi1 = (Integer i) -> System.out.println(i.getClass().getName());
		FIG<String> fis = (String s) -> System.out.println(s.length());
		FIG<Float> fif = (Float f) -> System.out.println(f);
		FIG<StringBuffer> fisb = (StringBuffer s) -> System.out.println(s.append("randaom"));
		fi1.display(1);
		fis.display("   jdvbjsadbvjhv");
		fif.display(10.0f);
		// int->float
		// Integer ->FLoat
		fisb.display(new StringBuffer("abc"));
	}

}
