package org.opentutorials.java2.constant_enum;

enum FRUIT5 {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	FRUIT5(String color) {
		//System.out.println("Call constructor: " + getColor() + " " + this);		//3개 인스턴스 생성
		this.color = color;
	}
}
enum COMPANY5 {
	APPLE, GOOGLE, ORACLE;
}

public class ConstantEnum3 {

	public static void main(String[] args) {
		for (FRUIT5 fruit : FRUIT5.values()) {	//반복문
			System.out.println(fruit + " is " + fruit.getColor());
		}
	}

}
