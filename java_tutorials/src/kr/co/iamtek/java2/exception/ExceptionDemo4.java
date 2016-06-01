package kr.co.iamtek.java2.exception;

import java.io.*;

//예외 처리 : throw 던지기

class B {
	void run() throws FileNotFoundException, IOException {	//예외 C에게 넘기기
		/*
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader (new FileReader("out.txt"));
			input = bReader.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
		 */
		BufferedReader bReader = new BufferedReader (new FileReader("out1.txt"));
		String input = bReader.readLine();
		System.out.println(input);
		System.out.println("END");
	}
}

class C {
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		b.run();
	}
}

public class ExceptionDemo4 {	//Throw

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {	//IOException의 자식클래스, 없어도 됨.
			System.out.println("File not found!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
