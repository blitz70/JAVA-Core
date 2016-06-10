package kr.co.iamtek.java2.modifier_access;

class A {
	public String x(){
		return z();
	};
	public String y(){
		return "public String y()";
	};
	private String z() {
		return "private String z()";
	};
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x());
		System.out.println(a1.y());
		//System.out.println(a1.z());	//에러

	}

}
