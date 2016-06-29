package org.opentutorials.java1.condition;

public class Login3 {

	public static void main(String[] args) {
		String id = args[0];
		String pwd = args[1];
		if (id.equals("blitz") && pwd.equals("1234")) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Login failed");
		};
	}
}
