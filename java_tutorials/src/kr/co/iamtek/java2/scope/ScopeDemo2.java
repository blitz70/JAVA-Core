package kr.co.iamtek.java2.scope;

public class ScopeDemo2 {

	static int i;
	
	static void a() {
		 i = 0;	
	};
	
	public static void main(String[] args) {

		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);		//무한, i 는 클래스(전역) 변수
		};
	}

}
