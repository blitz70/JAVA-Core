package kr.co.iamtek.java2.object;

public class Calculator2 {

	public static void sum(int left, int right) {
		//로직이 아주 크다고 가정
		System.out.println(left + right);
	};
	public static void main(String[] args) {
		sum (10, 20);
		sum (20, 40);
	};

}
