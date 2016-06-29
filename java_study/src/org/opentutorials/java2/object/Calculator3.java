package org.opentutorials.java2.object;

public class Calculator3 {

	public static void sum(int left, int right) {
		System.out.println(left + right);
	};
	public static void ave(int left, int right) {
		System.out.println((left + right)/2);
	};
	public static void main(String[] args) {
		int left, right;
		
		left = 10; right = 20;
		sum (left, right);
		ave (left, right);
		
		left = 20; right = 40;
		sum (left, right);
		ave (left, right);
	};

}
