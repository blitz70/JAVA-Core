package org.opentutorials.java2.constant_enum;

class FRUIT2 {
	public static final FRUIT2 APPLE = new FRUIT2();
	public static final FRUIT2 PEACH = new FRUIT2();
	public static final FRUIT2 BANANA = new FRUIT2();
	FRUIT2(){
		System.out.println("Call constructor: "+this);;
	}
}

class COMPANY2 {
	public static final COMPANY2 APPLE = new COMPANY2();
	public static final COMPANY2 GOOGLE = new COMPANY2();
	public static final COMPANY2 ORACLE = new COMPANY2();
}

public class ConstantDemo5 {

	public static void main(String[] args) {
		/*	error, can't compare different data types
		if (Fruit1.APPLE == Company1.APPLE) 
			System.out.println("Doh!");
		};
		*/
		FRUIT2 type = FRUIT2.APPLE;
		/*	error, cant't use instance as switch value
		switch (type) {
			case Fruit1.APPLE:
				System.out.println(57+" kcal");
				break;
			case Fruit1.PEACH:
				System.out.println(34+" kcal");
				break;
			case Fruit1.BANANA:
				System.out.println(93+" kcal");
				break;
			default:
				break;
		}
		*/
	}

}
