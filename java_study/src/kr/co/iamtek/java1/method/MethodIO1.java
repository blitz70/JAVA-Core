package kr.co.iamtek.java1.method;

public class MethodIO1 {

	public static void numbering(int max) {	//parameter, 매개변수
		for (int i = 0; i < max; i++) {
			System.out.println(i);
		};
	}

	public static void main(String[] args) {
		numbering(6);	//argument, 인자
	}


}
