package com.marolix.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class QMycomp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// System.out.println("compare called");
		return -o1.compareTo(o2);
	}

}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Comparator<Integer> c = new QMycomp();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.offer(1);
		pq.offer(4);
		pq.offer(8);
		pq.offer(2);
		pq.offer(1);
		pq.offer(9);
		System.out.println(pq);

		while (pq.peek() != null) {
			System.out.println(pq.poll());
	}
		
	}

}
