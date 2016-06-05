package kr.co.iamtek.java2.reference;

class B {
	int id;
	B(int id) {
		this.id = id;
	}
}

public class ReferenceParameter1 {

	static void _value(int b) {
		System.out.println("runValue b: " + b);	//1
		b = 2;
		System.out.println("runValue b: " + b);	//2
	}
	public static void runValue() {
		int a = 1;
		System.out.println("runValue a: " + a);	//1
		_value(a);
		System.out.println("runValue a: " + a);	//1
	}
	static void _reference1(B b) {
		System.out.println("runReference1 b: " + b.id);	//1
		b = new B(2);
		System.out.println("runReference1 b: " + b.id);	//2
	}

	public static void runReference1() {
		B a = new B(1);
		System.out.println("runReference1 a: " + a.id);	//1
		_reference1(a);
		System.out.println("runReference1 a: " + a.id);	//1
	}
	static void _reference2(B b) {
		System.out.println("runReference2 b: " + b.id);	//1
		b.id = 2;
		System.out.println("runReference2 b: " + b.id);	//2
	}

	public static void runReference2() {
		B a = new B(1);
		System.out.println("runReference2 a: " + a.id);	//1
		_reference2(a);
		System.out.println("runReference2 a: " + a.id);	//2
	}
	public static void main(String[] args) {
		runValue();			//a=1, b=1, b=2, a=1
		runReference1();	//a=1, b=1, b=2, a=1
		runReference2();	//a=1, b=1, b=2, a=2
	}
}
