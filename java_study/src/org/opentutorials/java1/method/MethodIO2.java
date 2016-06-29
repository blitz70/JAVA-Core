package org.opentutorials.java1.method;

public class MethodIO2 {

	public static void numbering(int min, int max) {	//parameters
		int i = min;
		while (i < max) {
			System.out.println(i++);
		};
	}

	public static void main(String[] args) {
		numbering(2, 6);	//arguments
	}


}
