package kr.co.iamtek.java2.reference;

class A {
	int id;
	A(int id) {
		this.id = id;
	}
}

public class ReferenceDemo1 {

	public static void runValue() {
		int a = 1;
		int b = a;	//copy
		b = 2;
		System.out.println("runValue a: " + a);
		System.out.println("runValue b: " + b);
	}
	public static void runReference() {
		A a = new A(1);
		A b = a;	//reference
		A c = new A(1);
		b.id = 2;
		c.id = 3;
		System.out.println("runReference a: " + a.id);
		System.out.println("runReference b: " + b.id);
		System.out.println("runReference c: " + c.id);
	}
	public static void main(String[] args) {
		runValue();		//a=1, b=2
		runReference();	//a=2, b=2, c=3
	}

}
