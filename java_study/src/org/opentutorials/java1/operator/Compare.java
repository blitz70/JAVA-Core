package org.opentutorials.java1.operator;

public class Compare {

	public static void main(String[] args) {
		System.out.println("== equal operator");
		System.out.println(1 == 2);							//false
		System.out.println(1 == 1);							//true
		System.out.println("one" == "two");				//false
		System.out.println("one" == "one");				//true

		System.out.println("!= not equal operator");
		System.out.println(1 != 2);							//true
		System.out.println(1 != 1);							//false
		System.out.println("one" != "two");				//true
		System.out.println("one" != "one");				//false

		System.out.println("> greater than operator");
		System.out.println(10 > 20);						//false
		System.out.println(10 > 2);							//true
		System.out.println(10 > 10);						//false

		System.out.println(">= greater than or equal operator");
		System.out.println(10 >= 20);						//false
		System.out.println(10 >= 2);						//true
		System.out.println(10 >= 10);						//true

	}

}
