package kr.co.iamtek.java2.modifier_interface;

interface I {
	public void z();
};

class A implements I {
	public void z() {
		System.out.println("Interface modifier");
	};
};

//class A1 implements I {};		//error, need to implement methods.

public class InterfaceDemo1 {
	public static void main (String[] args) {
		A a1 = new A();
		a1.z();
	};

}
