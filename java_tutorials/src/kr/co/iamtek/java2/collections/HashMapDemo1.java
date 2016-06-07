package kr.co.iamtek.java2.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo1 {
	
	static void iteratorUsingForEach1(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	static void iteratorUsingForEach2(HashMap map) {
		Set<Entry> entries = map.entrySet();
		for (Entry entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	static void iteratorUsingIterator1(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator mi = entries.iterator();
		while (mi.hasNext()) {
			System.out.println(mi.next());
		};
	}
	static void iteratorUsingIterator2(HashMap map) {
		Set<Entry> entries = map.entrySet();
		Iterator mi = entries.iterator();
		while (mi.hasNext()) {
			System.out.println(mi.next());
		};
	}

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer> ();
		a.put("I", 1);
		a.put("II", 2);
		a.put("III", 3);
		a.put("IV", 4);
		System.out.println(a.get("I"));
		System.out.println(a.get("II"));
		System.out.println(a.get("III"));
		
		iteratorUsingForEach1(a);
		iteratorUsingForEach2(a);
		iteratorUsingIterator1(a);
		iteratorUsingIterator2(a);
	}

}
