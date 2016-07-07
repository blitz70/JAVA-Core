package center.wiz.java3.java26_collections;

import java.util.HashSet;

public class MainSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("str0");
		set.add("str1");
		set.add("str2");
		set.add("str3");
		set.add("str2");
		System.out.println(set.toString());				//[str3, str1, str2, str0]
		
		set.remove("str0");
		System.out.println(set.toString());				//[str3, str1, str2]
		
		System.out.println("사이즈 : " + set.size());	//3
	}

}
