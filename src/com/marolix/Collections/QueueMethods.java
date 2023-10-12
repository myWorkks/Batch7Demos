package com.marolix.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.offer(1);
		q.offer(10);
		q.offer(4);
		q.offer(20);

		System.out.println(q);
		System.out.println("poll method " + q.poll());
		System.out.println("after poll " + q);
		System.out.println("remove method " + q.remove());
		System.out.println("after remove " + q);
		System.out.println("peek method "+q.peek());
		System.out.println("after peek "+q);
		System.out.println("element method "+q.element());
		System.out.println("after element "+q);
	}

}
