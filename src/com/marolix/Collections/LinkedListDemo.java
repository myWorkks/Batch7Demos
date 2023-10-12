package com.marolix.Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println(ll);
		ll.add(1);
		ll.offer(2);
		System.out.println(ll);
		ll.offerFirst(3);
		System.out.println(ll);
		ll.offerLast(7);
		System.out.println(ll);

		// List get
		int a = ll.get(0);
		System.out.println("element at 2nd index " + a);

		System.out.println("fetching elemnt a head " + ll.peekFirst());
		System.out.println("fetching elemnt a tail " + ll.peekLast());

		ll.set(3, 10);
		System.out.println(ll);

		// remove,remove,poll,pollFirst,pollLast

		// ll.remove();// removes elemnt from head position based on queue interface
		ll.poll();
		System.out.println(ll);// 1,2,10
		// deque methods to remove elements
		// poolFirst,pollLast,removeFirst,removeLast

		// ll.pollLast();//1,2
		ll.removeLast();

		System.out.println(ll);

		// create ,update,delete,read

	}

}
