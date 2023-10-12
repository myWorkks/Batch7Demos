package com.marolix.FunctionalInterfaces;

@FunctionalInterface
public interface FIDemo {
void m1();
//public void m2();
default void m3() {}
private void m4() {}
static void m5() {}

}
