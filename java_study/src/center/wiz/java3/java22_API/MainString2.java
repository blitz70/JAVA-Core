package center.wiz.java3.java22_API;

public class MainString2 {
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("abcdefg");
		
		System.out.println(str);
		
		str.append("hijkmn");
		System.out.println(str);		//abcdefghijkmn
		str.insert(3, "AAA");
		System.out.println(str);		//abcAAAdefghijkmn
		str.delete(3, 5);
		System.out.println(str);		//abcAdefghijkmn
		str.deleteCharAt(10);
		System.out.println(str);		//abcAdefghikmn
		
	}

}
