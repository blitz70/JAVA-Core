package kr.co.iamtek.java2.scope;

class C {
	
	int v = 10;
	
	void m() {
		System.out.println(v);
	};
}
public class ScopeDemo7 {

	public static void main(String[] args) {
		
		C c1 = new C();
		c1.m();

	}

}
