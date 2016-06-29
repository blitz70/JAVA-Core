package org.opentutorials.java2.polymorphism;

interface I2{
	public String a();
}

interface I3{
	public String b();
}

class D implements I2, I3{
	public String a(){
		return "a";
	};
	public String b(){
		return "b";
	};
}

public class PolymorphismInterfaceDemo2 {

	public static void main(String[] args) {

		D obj1 = new D();
		I2 obj2 = new D();
		I3 obj3 = new D();
		
		System.out.println(obj1.a());	//a
		System.out.println(obj1.b());	//b
		
		System.out.println(obj2.a());	//a
		//System.out.println(obj2.b());	//error

		//System.out.println(obj3.a());	//error
		System.out.println(obj3.b());	//b

	}

}
