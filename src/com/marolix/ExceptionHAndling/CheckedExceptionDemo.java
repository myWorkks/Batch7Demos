package com.marolix.ExceptionHAndling;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// Class.forName("java.lang.String");//ClassNotFOundException
		File f = new File("abc.txt");
		//FileInputStream fis = new FileInputStream(f);//FileNotFOundException
		
		//Connection c=DriverManager.getConnection("","","");//SQLException

	}

}
