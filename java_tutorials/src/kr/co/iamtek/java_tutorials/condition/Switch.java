package kr.co.iamtek.java_tutorials.condition;

public class Switch {

	public static void main(String[] args) {
		int a;
		a = 2;
		switch(a) {
		case 1:
			System.out.println("one");		//
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		};
		System.out.println("switch(1)");
		switch(1) {
		case 1:
			System.out.println("one");		//
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		};
		System.out.println("switch(2)");
		switch(2) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");		//
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		};
		System.out.println("switch(3)");
		switch(3) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");	//
			break;
		default:
			System.out.println("default");
			break;
		};
		System.out.println("switch(10)");
		switch(10) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");	//
			break;
		};
	}
}
