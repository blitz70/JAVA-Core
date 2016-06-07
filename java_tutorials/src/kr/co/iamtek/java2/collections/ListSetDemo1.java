package kr.co.iamtek.java2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetDemo1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("다섯");
		Iterator ai = al.iterator();
		while (ai.hasNext()) {
			System.out.println(ai.next());
		}
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("two");		//무시
		hs.add("three");
		hs.add("three");	//무시
		hs.add("다섯");
		Iterator hi = hs.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());
		}

	}

}
