package org.opentutorials.java2.inheritance;

public class OverloadDemo3 extends OverloadDemo2{

	void A(String arg1, String arg2) {System.out.println("subclass void A(String arg1, String arg2)");};
	void A() {System.out.println("subclass void A()");};

	public static void main(String[] args) {
		OverloadDemo3 o = new OverloadDemo3();
		o.A();
		o.A(1);
		o.A("coding everybody");
		o.A("coding everybody", "coding everybody");

	}

}
