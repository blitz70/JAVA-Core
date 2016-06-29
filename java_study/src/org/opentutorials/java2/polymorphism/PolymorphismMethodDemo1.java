package org.opentutorials.java2.polymorphism;
//method overloading

class O{
	public void a(int param){
		System.out.println("숫자출력: " + param);
	}
	public void a(String param){
		System.out.println("문자출력: " + param);
	}
}
public class PolymorphismMethodDemo1 {

	public static void main(String[] args) {
		O o1 = new O();
		o1.a(15);
		o1.a("Hello world");
		
	}

}
