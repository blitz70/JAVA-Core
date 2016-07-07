package center.wiz.java3.java27_collections;

import java.util.*;

public class MainIterator {

	public static void main(String[] args) {
		
		System.out.println("==========");
		ArrayList<String> list = new ArrayList<String>();
		list.add("str0");
		list.add("str1");
		list.add("str2");
		System.out.println("for");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println("iterator");
		Iterator<String> i1 = list.iterator();
		while (i1.hasNext()) {
			String str = i1.next();
			System.out.println(str);
		}
		System.out.println("==========");
		
		System.out.println("==========");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "str0");
		map.put(10, "str10");
		map.put(20, "str20");
		map.put(30, "str30");
		Set<Integer> set = map.keySet();
		Iterator<Integer> i2 = set.iterator();
		while(i2.hasNext()) {
			int key = i2.next();
			String str = key + " : " + map.get(key);
			System.out.println(str);
		}
		System.out.println("==========");
	}

}
