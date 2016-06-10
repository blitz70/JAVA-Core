package kr.co.iamtek.java2.exception;

import java.io.*;

public class ExceptionDemo3{

	public static void main(String[] args) {
		/*
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);
		*/
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
	}

}
