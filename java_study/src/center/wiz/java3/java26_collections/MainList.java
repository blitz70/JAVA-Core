package center.wiz.java3.java26_collections;

import java.util.*;

public class MainList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		Vector<String> list3 = new Vector<String>();
		System.out.println(list);
		
		//추가 add()
		list.add("str0");
		list.add("str1");
		list.add("str2");
		list.add("str3");
		System.out.println(list.toString());		//[str0, str1, str2, str3]
		list.add("str4");
		System.out.println(list.toString());		//[str0, str1, str2, str3, str4]
		list.add(2, "STR");
		System.out.println(list.toString());		//[str0, str1, STR, str2, str3, str4]
		
		//조회 get()
		String index3 = list.get(3);
		System.out.println(index3);			//str2
		
		//수정 set()
		list.set(2, "str222222");
		System.out.println(list.toString());		//[str0, str1, str222222, str2, str3, str4]
		
		//크기 size()
		int size = list.size();
		System.out.println("크기 : " + size);	//6
		
		//삭제 remove() clear()
		list.remove(2);
		System.out.println(list.toString());		//[str0, str1, str2, str3, str4]
		list.clear();
		System.out.println(list.toString());		//[]
		list = null;
		System.out.println(list);					//null
		//System.out.println(al.size());			//error
	}
	
}
