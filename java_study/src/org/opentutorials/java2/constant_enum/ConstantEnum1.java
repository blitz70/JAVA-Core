package org.opentutorials.java2.constant_enum;

/*
class FRUIT2 {
	public static final Fruit1 APPLE = new Fruit1();
	public static final Fruit1 PEACH = new Fruit1();
	public static final Fruit1 BANANA = new Fruit1();
}
*/
enum FRUIT3 {
	APPLE, PEACH, BANANA;
}
enum COMPANY3 {
	APPLE, GOOGLE, ORACLE;
}

public class ConstantEnum1 {

	public static void main(String[] args) {
		FRUIT3 type = FRUIT3.APPLE;
		switch (type) {
			case APPLE:
				System.out.println(57+" kcal");
				break;
			case PEACH:
				System.out.println(34+" kcal");
				break;
			case BANANA:
				System.out.println(93+" kcal");
				break;
			default:
				break;
		}
	}

}
