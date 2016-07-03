package center.wiz.java3.java22_API;

public class MainTest {

	public static void main(String[] args) {

		long start, end;

		start = System.currentTimeMillis();
		String str1 = "A";
		for (int i = 0; i < 50000; i++) {
			str1 += "A";
		}
		end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end - start));
		
		start = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("A");
		for (int i = 0; i < 50000; i++) {
			str2.append("A");
		}
		end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end - start));
		
		start = System.currentTimeMillis();
		StringBuffer str3 = new StringBuffer("A");
		for (int i = 0; i < 50000; i++) {
			str3.append("A");
		}
		end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end - start));
	}

}
