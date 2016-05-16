package kr.co.iamtek.java_tutorials.operator;

public class Equalstring {

	public static void main(String[] args) {
		String a = "Hello world";
		String b = new String ("Hello world");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println(a.equals(b));	//문자열 동등 비교

	}

}
