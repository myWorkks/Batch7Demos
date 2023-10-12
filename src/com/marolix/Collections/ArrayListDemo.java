package com.marolix.Collections;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		ArrayList<Integer> al1 = new ArrayList<Integer>(q);
		System.out.println(al1);

	}

}
