package org.opentutorials.java2.constant_enum;

enum FRUIT4 {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	FRUIT4(String color) {
		System.out.println("Call constructor: " + getColor() + " " + this);		//3개 인스턴스 생성
		this.color = color;
	}
}
enum COMPANY4 {
	APPLE, GOOGLE, ORACLE;
}

public class ConstantEnum2 {

	public static void main(String[] args) {
		FRUIT4 type = FRUIT4.APPLE;
		String str = type.toString() +" is " + type.getColor() + " with ";
		switch (type) {
			case APPLE:
				System.out.println(str + 57 + " kcal.");
				break;
			case PEACH:
				System.out.println(str + 34 + " kcal.");
				break;
			case BANANA:
				System.out.println(FRUIT4.BANANA.toString() +" is " + FRUIT4.BANANA.getColor() + " with " + 93 + " kcal.");
				break;
			default:
				break;
		}
	}

}
