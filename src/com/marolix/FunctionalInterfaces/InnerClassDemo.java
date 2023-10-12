package com.marolix.FunctionalInterfaces;

public class InnerClassDemo {
	class Base extends B2 {

		@Override
		public void m2() {
			System.out.println("this is overriden method in the calss b2");
			
		}
	}

	class B1 {

		public void m1() {
			System.out.println("this is m1 method of inner class B1");
		}
	}

	abstract class B2 {

		public void m1() {
			System.out.println("this is m1 method of inner class B2");
		}

		abstract public void m2();

	}

	final class B3 {
		public void m1() {
			System.out.println("this is m1 method of inner class B3");
		}
	}

	public class B4 {
	}

	static class B5 {
		public void m1() {
			System.out.println("this is m1 method of inner class B2");
		}
	}

	private class B6 {
	}

	protected class B7 {
	}
}

class B {

	public void m1() {
	}
}

abstract class C {
}

final class D {
}

strictfp class E {
}
// private class E{}
// protected class D1{}