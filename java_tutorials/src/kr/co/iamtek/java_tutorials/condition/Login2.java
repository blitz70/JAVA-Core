package kr.co.iamtek.java_tutorials.condition;

public class Login2 {	//check id, pass

	public static void main(String[] args) {
		String id = args[0];
		String pwd = args[1];
		if (id.equals("blitz")) {
			if (pwd.equals("1234")) {
				System.out.println("Welcome!");
			} else {
				System.out.println("Wrong password");
			};
		} else {
			System.out.println("Wrong ID");
		};
	}
}
