package kr.co.iamtek.java1.method;

public class Return2 {

	public static void main(String[] args) {
		String[] members = getmembers();
		for (String name : members) {
			System.out.println(name);
		};
	};
	public static String[] getmembers() {	//복수 데이터 return
		String[] family = {"blitz", "oju", "curie"};
		return family;
	};
}
