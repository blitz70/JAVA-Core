package kr.co.iamtek.java2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo1 {

	public static void main(String[] args) {
		
		HashSet<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		HashSet<Integer> b = new HashSet<Integer>();
		b.add(3);
		b.add(4);
		b.add(5);
		HashSet<Integer> c = new HashSet<>();
		c.add(1);
		c.add(2);
		
		System.out.println(a.containsAll(b));	//false
		System.out.println(a.containsAll(c));	//true
		
		//a.addAll(b);		//union set, 1 2 3 4 5
		//a.retainAll(b);	//intersection set, 3
		a.removeAll(b);		//difference set, 1 2
		Iterator hi = a.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());
		};
	}

}
