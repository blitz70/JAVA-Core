package org.opentutorials.java1.method;

public class Method3 {

	public static void main(String[] args) {
		numbering();	//코드 재활용에 method 활용, 코드량 감소, 유지보수 쉬움
		numbering();
		numbering();
		System.out.println(numbering());
	}

	public static String numbering() {	//method returns a string
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		};
		return "End";
	}

}
