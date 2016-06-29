package org.opentutorials.java2.constant_enum;

interface FRUIT1 {
	int APPLE = 1, PEACH =2, BANANA =3;
}

interface COMPANY1 {
	int APPLE = 1, GOOGLE = 2, ORACLE =3;
}

public class ConstantDemo4 {

	public static void main(String[] args) {
		
		if (FRUIT1.APPLE == COMPANY1.APPLE) {	//problem
			System.out.println("Fuit & company same!");
		};
		int type = COMPANY1.APPLE;
		switch (type) {
			case FRUIT1.APPLE:
				System.out.println(57+" kcal");	//company has kcal!
				break;
			case FRUIT1.PEACH:
				System.out.println(34+" kcal");
				break;
			case FRUIT1.BANANA:
				System.out.println(93+" kcal");
				break;
			default:
				break;
		}
	}

}
