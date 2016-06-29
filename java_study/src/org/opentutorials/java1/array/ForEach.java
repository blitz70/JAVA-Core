package org.opentutorials.java1.array;

public class ForEach {
	
	public static void main(String[] args) {
		String[] members = {"blitz","oju","curie","김성규"};
		for (String str : members) {
			System.out.println(str + " 상담 완료");
		}
		int[] numbers = {1,2,3,4,5};
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
