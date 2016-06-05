package kr.co.iamtek.java2.constant_enum;

public class ConstantDemo1 {
	public static void main(String[] args) {
		/*	이부분이 삭제 되면 난감함.
		1. 사과
		2. 복숭아
		3. 바나나
		*/
		int type = 1;	//사과
		switch (type) {
			case 1:
				System.out.println(57);
				break;
			case 2:
				System.out.println(34);
				break;
			case 3:
				System.out.println(93);
				break;
			default:
				break;
		}
	}

}
