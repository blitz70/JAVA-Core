package kr.co.iamtek.java2.constant_enum;

public class ConstantDemo2 {
	final static int APPLE = 1;
	final static int PEACH = 2;
	final static int BANANA = 3;

	public static void main(String[] args) {

		int type = APPLE;
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
