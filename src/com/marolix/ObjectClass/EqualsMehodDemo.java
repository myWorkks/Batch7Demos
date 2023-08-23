package com.marolix.ObjectClass;

import java.util.Objects;

class Student {
	int stdId;
	String name;
	
	
	
	
	
	
	
	
	
	

	public Student(int stdId, String name) {
		super();
		this.stdId = stdId;
		this.name = name;
	}











//	@Override
//	public int hashCode() {
//		return Objects.hash(name, stdId);
//	}











	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && stdId == other.stdId;
	}

//	public boolean equals(Object s) {
//
//		if (s != null && s instanceof Student) {
//			Student std2 = (Student) s;
//			if (this == std2) {
//				return true;
//			} else {
//				if (this.stdId == std2.stdId && this.name.equals(std2.name)) {
//					return true;
//				} else
//					return false;
//			}
//
//		} else
//			return false;
//	}

}

public class EqualsMehodDemo {

	public static void main(String[] args) {
//		String s1 = new String("abc");
//		String s2 = new String("abc");
		Object s1 = new String("abc");
		Object s2 = new String("abc");

		// reasons
//		System.out.println(s1 == s2);// false
//		System.out.println(s1.equals(s2));// true

		Student std1 = new Student(1, "bharath");
//		Student std2 = new Student(1, "bharath");
		Student std2 = std1;

		// System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		// return this==std2
		// return std1==sdt2

	}

}
