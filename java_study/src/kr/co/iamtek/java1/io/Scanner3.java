package kr.co.iamtek.java1.io;

import java.util.Scanner;
import java.io.*;

public class Scanner3 {

	public static void main(String[] args) {	//out.txt 내용(숫자) 천배로 출력, 숫자 입력시 반복
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()){
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	};

}
