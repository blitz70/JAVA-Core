package kr.co.iamtek.java2.polymorphism;

class A{
	public String x(){return "A.x";}
}

class B extends A{
	public String x(){return "B.x";}
	public String y(){return "B.y";}
}

class B2 extends A{
	public String x(){return "B2.x";}
}

public class PolymorphismClassDemo1 {

	public static void main(String[] args) {
		
		A obj = new B();	//not [B obj = new B();], class poly
		System.out.println(obj.x());	//B.x
		//System.out.println(obj.y());	//error, method doesn't exist in A
		A obj2 = new B2();
		System.out.println(obj2.x());	//B2.x
	}

}
