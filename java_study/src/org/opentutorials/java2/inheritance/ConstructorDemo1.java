package org.opentutorials.java2.inheritance;

public class ConstructorDemo1 {

	public ConstructorDemo1() {};	//1. 생성자(2) 지정으로 기본 생성자가 자동으로 안만들어짐, 직접 정의해야 함 
	
	public ConstructorDemo1(int param1) {};	//2. 생성자 정의

	public static void main(String[] args) {
		
		ConstructorDemo1 c = new ConstructorDemo1();

	}

}
