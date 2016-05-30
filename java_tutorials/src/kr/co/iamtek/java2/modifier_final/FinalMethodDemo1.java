package kr.co.iamtek.java2.modifier_final;

class A {
	final void b(int a){	//final method
		System.out.println("int : " + a);
	};
};

class B extends A{
	//void b(int a) {};	//error, can't override final method
	void b(double a) {
		System.out.println("float : " + a);
	};
	void b(String a){
		System.out.println("String : " + a);
	};
};

class C extends B{
	void b(double a) {
		System.out.println("float is : " + a);
	};
};

public class FinalMethodDemo1 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.b(10);
		c1.b("hello");
		c1.b(15.0);

	}

}
