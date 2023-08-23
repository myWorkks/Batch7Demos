package com.marolix.ExceptionHAndlinling.Questions;

import java.util.Scanner;

public class Question4 {
public static void main(String[] args)throws RuntimeException {
int a=10;
	if(a<18) {
		System.out.println("age is "+a);
		throw new Exception("not elgible for vote");
//		System.out.println("try after 18 years");
	}
		
}
}
