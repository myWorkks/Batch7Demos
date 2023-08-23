package com.marolix.pack2.oops;

import java.util.Scanner;

class Login {

	public String validLogin(long phno, String pswrd) {

		return "login successfull using phone number";
	}

	public String validLogin(String email, String pswrd) {

		return "login successfull using email";
	}

	public String validLogin(int id, String pswrd) {

		return "login successfull using userid";
	}
}

public class OverloadingDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter login crendentials");
		String pswd = sc.next();
//		int input = sc.nextInt();

		Login l = new Login();
		System.out.println(l.validLogin(1, "abc"));
		;
		System.out.println(l.validLogin("email", "pswd"));
		;
		System.out.println(l.validLogin(9063388021l, "pswd"));
	}
}
