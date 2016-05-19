package kr.co.iamtek.java1.condition;

public class Login1 {	//check id

	public static void main(String[] args) {
		String id = args[0];
		if (id.equals("blitz")) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Wrong ID");
		};
	};
};
