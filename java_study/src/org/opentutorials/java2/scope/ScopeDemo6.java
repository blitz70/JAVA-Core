package org.opentutorials.java2.scope;

public class ScopeDemo6 {
	static int i = 5;

	static void a() {
		int i = 10;
		b();
	};
	
	static void b() {
		i = 15;	//
		int i = 20;	//우선 순위 높음
		System.out.println(i);
	};
	
	public static void main(String[] args) {
		int i = 1;
		a();
	}

}
