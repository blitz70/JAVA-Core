package kr.co.iamtek.java2.modifier_abstract;

abstract class A {
	public abstract String b();									//추상 메소드, 본체{}가 없음.
	//public abstract String c() {return "Hello";};		//error
	public void d(){System.out.println("World");};	//추상 클래스에 일반 메소드 존재 가능.
}

class B extends A{
	public String b() {
		return "Hello";
	};
};

public class AbstractDemo1 {

	public static void main(String[] args) {
		//A obj = new A();	//error
		B obj = new B();
		System.out.println(obj.b());
		obj.d();

	}

}
