package org.opentutorials.java2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortDemo1 {

	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "blitz"));
		computers.add(new Computer(200, "oju"));
		computers.add(new Computer(3000, "curie"));
		System.out.println("before");
		Iterator<Computer> i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("after");
		Collections.sort(computers);
		Iterator<Computer> i2 = computers.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}

class Computer implements Comparable<Object> {
	
	int serial;
	String owner;
	
	Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
	}
	public String toString() {
		return serial + " : " + owner;
	}
}