package kr.co.iamtek.java_tutorials.operator;

public class Logic2 {	//or

	public static void main(String[] args) {
		if (true || true) {
			System.out.println("T or T");	//
		};
		if (true || false) {
			System.out.println("T or F");	//
		};
		if (false || true) {
			System.out.println("F or T");	//
		};
		if (false || false) {
			System.out.println("F or F");	
		};
	};
};
