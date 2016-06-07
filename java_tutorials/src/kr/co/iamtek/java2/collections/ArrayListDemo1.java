package kr.co.iamtek.java2.collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[2] = "three";	//error
		for (int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		};
		ArrayList<String> al = new ArrayList<String>();	//문자열 저장 지정.
		al.add("one");
		al.add("two");
		al.add("three");
		for (int i = 0; i < al.size(); i++) {
			String value = al.get(i);
			System.out.println(value);
		}
	}

}
