package kr.co.iamtek.java_tutorials.operator;

public class Logic1 {	//and

	public static void main(String[] args) {
		if (true && true) {
			System.out.println("T and T");	//
		};
		if (true && false) {
			System.out.println("T and F");
		};
		if (false && true) {
			System.out.println("F and T");
		};
		if (false && false) {
			System.out.println("F and F");
		};
	}
}
