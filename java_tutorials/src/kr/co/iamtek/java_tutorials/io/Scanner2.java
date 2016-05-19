package kr.co.iamtek.java_tutorials.io;

import java.util.Scanner;;

public class Scanner2 {

	public static void main(String[] args) {	//입력 숫자 천배로 출력, 숫자 입력시 반복
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			System.out.println(sc.nextInt()*1000);
		};
		sc.close();
	};

}
