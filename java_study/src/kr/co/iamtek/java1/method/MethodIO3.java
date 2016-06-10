package kr.co.iamtek.java1.method;

public class MethodIO3 {

	public static String numbering(int min, int max) {	//method returns a string
		int i = min;
		String str = "";
		while (i < max) {
			str += i;	// str = str + i
			i++;
		};
		return str;	//
	}

	public static void main(String[] args) {
		String output = numbering(3, 8);
		System.out.println(output);
	}


}
