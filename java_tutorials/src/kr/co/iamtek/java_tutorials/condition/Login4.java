package kr.co.iamtek.java_tutorials.condition;

public class Login4 {

	public static void main(String[] args) {
		String id = args[0];
		String pwd = args[1];
		if ((id.equals("blitz") || id.equals("oju") || id.equals("curie")) && pwd.equals("1234")) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Login failed");
		};
	};
};
