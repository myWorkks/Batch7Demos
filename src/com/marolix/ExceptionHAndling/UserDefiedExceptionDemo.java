package com.marolix.ExceptionHAndling;

class RegistrationAppException extends RuntimeException {

	public RegistrationAppException(String message) {
		super(message);
	}
}

class RegistrationApp {

	public void register(String phone, String email) throws RegistrationAppException {
//establish connection with db
		// queries to insert in table

		// check whether email is therea re not in dtabase
		// check whether phone number is there or not in database

		// assume connected with db
//throw new RegistrationAppException(email);
		
		if (email.equals("abc@gmail.com")) {
			//throw new String("abc");
			throw new RegistrationAppException("email already registered");}
		if (phone.equals("9063388012"))
			
			throw new RegistrationAppException("phone number already registered");
		System.out.println(email + " : " + phone);
		System.out.println("successfully registered");
	}
}

public class UserDefiedExceptionDemo {

	public static void main(String[] args) {
		RegistrationApp r = new RegistrationApp();
		String phone = "9063388012";
		String email = "ab1c@gmail.com";
		try {
			r.register(phone, email);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
