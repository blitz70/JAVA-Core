package org.opentutorials.java2.collections;

import java.util.*;

public class SetDemo1 {

	public static void main(String[] args) {
		
		HashSet<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b = new ArrayList<Integer>();		//HastSet -> ArrayList
		b.add(3);
		b.add(4);
		b.add(5);
		Collection<Integer> c = new HashSet<>();				//Collection은 부모.
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
