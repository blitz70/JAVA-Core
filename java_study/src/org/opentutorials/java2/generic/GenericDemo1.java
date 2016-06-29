package org.opentutorials.java2.generic;

class Person1<T> {	//T = generic
	public T info;
}

public class GenericDemo1 {

	public static void main(String[] args) {
		Person1<String> p1 = new Person1<String>();
		Person1<Integer> p2 = new Person1<Integer>();
		p1.info = "Hello";
		p2.info = 2;
		System.out.println(p1.info);
		System.out.println(p2.info);
	}

}
