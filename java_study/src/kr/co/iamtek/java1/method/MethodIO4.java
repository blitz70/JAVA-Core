package kr.co.iamtek.java1.method;

import java.io.*;	//파일 쓰기에 필요

public class MethodIO4 {

	public static String numbering(int min, int max) {	//method returns a string
		int i = min;
		String str = "";
		while (i < max) {
			str += i;
			i++;
		};
		return str;
	}

	public static void main(String[] args) {
		String output = numbering(3, 10);
		System.out.println(output);
		try {	//무시
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(output);
			out.close();
		}
		catch (IOException e) {
			
		}	//무시
	}


}
