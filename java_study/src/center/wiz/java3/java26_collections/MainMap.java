package center.wiz.java3.java26_collections;

import java.util.*;

public class MainMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map);
		
		//추가 put(), 수정
		map.put(0, "str0");
		map.put(10, "str10");
		map.put(20, "str20");
		map.put(30, "str30");
		System.out.println(map.toString());		//{0=str0, 20=str20, 10=str10, 30=str30}
		map.put(20, "STR20");
		System.out.println(map);					//{0=str0, 10=str10, 20=STR20, 30=str30}
		
		//조회 get()
		String str = map.get(20);
		System.out.println(str);						//str20
		
		//크기 size()
		System.out.println(map.size());			//4
		
		//삭제 remove() clear()
		map.remove(20);
		System.out.println(map);					//{0=str0, 10=str10, 30=str30}
		map.clear();
		System.out.println(map);					//{}
	}

}
