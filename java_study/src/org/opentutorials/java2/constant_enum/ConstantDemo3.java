package org.opentutorials.java2.constant_enum;

public class ConstantDemo3 {
	final static int FRUIT_APPLE = 1;
	final static int FRUIT_PEACH = 2;
	final static int FRUIT_BANANA = 3;
	
	//회사 내용 추가, APPLE이 있어서 이름에 prefix 추가
	final static int COMPANY_GOOGLE = 1;
	final static int COMPANY_APPLE = 2;
	final static int COMPANY_ORACLE = 3;

	public static void main(String[] args) {

		int type = FRUIT_APPLE;
		switch (type) {
			case FRUIT_APPLE:
				System.out.println(57+" kcal");
				break;
			case FRUIT_PEACH:
				System.out.println(34+" kcal");
				break;
			case FRUIT_BANANA:
				System.out.println(93+" kcal");
				break;
			default:
				break;
		}
	}

}
