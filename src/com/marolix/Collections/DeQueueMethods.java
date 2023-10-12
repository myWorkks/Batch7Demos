package com.marolix.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueMethods {

	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<Integer>();
		System.out.println("new  d que object " + d);
		d.offer(1);
		System.out.println("using offer method " + d);
		d.offer(2);
		System.out.println("using offer method " + d);
		d.offerFirst(20);
		System.out.println("using offerFirst method " + d);
		d.offerLast(30);
		System.out.println("using offerLast method " + d);

		d.addFirst(1);
		System.out.println("using addFirst method " + d);
		d.addLast(50);
		System.out.println("using offerLast method " + d);

		int a = d.peekFirst();
		System.out.println("peek first " + a + "\n" + d);
		a = d.peekLast();
		System.out.println("peek last " + a + "\n" + d);

		a = d.getFirst();
		System.out.println("get first " + a + "\n" + d);
		a = d.getLast();
		System.out.println("get last " + a + "\n" + d);

		// d.remove();
		// d.poll()
		a = d.pollFirst();
		System.out.println("poll first " + a + "\n" + d);
		a = d.pollLast();
		System.out.println("poll last " + a + "\n" + d);
		a = d.removeFirst();
		System.out.println("remove first " + a + "\n" + d);
		a = d.removeLast();
		System.out.println("remove last " + a + "\n" + d);
		d.removeFirstOccurrence("1");
//		d.removeFirstOccurrence(2);
//		d.removeFirstOccurrence(2);
		System.out.println("remove first occurance " + d);
	}

}
