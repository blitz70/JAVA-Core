package org.opentutorials.java2.inheritance;

public class OverloadDemo2 {
	
	void A() {System.out.println("void A()");};
	void A(int arg1) {System.out.println("void A(int arg1)");	};
	void A(String arg1) {System.out.println("void A(String arg1)");};
	
	//int A() {System.out.println("int A()");return 1;};

	public static void main(String[] args) {
		OverloadDemo2 o = new OverloadDemo2();
		o.A();
		o.A(1);
		o.A("coding everybody");

	}

}
