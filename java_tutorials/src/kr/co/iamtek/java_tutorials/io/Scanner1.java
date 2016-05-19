package kr.co.iamtek.java_tutorials.io;

import java.util.Scanner;;

public class Scanner1 {

	public static void main(String[] args) {	//입력 숫자 천배로 출력
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	};

}
