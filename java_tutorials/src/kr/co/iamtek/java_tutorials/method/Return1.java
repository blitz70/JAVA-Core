package kr.co.iamtek.java_tutorials.method;

public class Return1 {

	public static void main(String[] args) {
		System.out.println(number(4));
	}

	public static String number(int no) {
		switch (no) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		default:
			return "four or above";
		}
	}

}
