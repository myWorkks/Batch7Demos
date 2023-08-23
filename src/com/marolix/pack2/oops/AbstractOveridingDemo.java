package com.marolix.pack2.oops;
abstract class Abstract{
	public abstract void m1();
	
}
public class AbstractOveridingDemo extends Abstract {

	@Override
	public void m1() {
		
		
	}

}
 abstract class C extends  AbstractOveridingDemo{
	
	public abstract void m1();
}
