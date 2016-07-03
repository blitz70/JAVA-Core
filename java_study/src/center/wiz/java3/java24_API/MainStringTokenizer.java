package center.wiz.java3.java24_API;

import java.util.StringTokenizer;

public class MainStringTokenizer {

	public static void main(String[] args) {

		String str1 = "오늘의 날씨는 매우 춥고, 눈이 오고 있습니다.";
		String str2 = "오늘의 날짜는 2014/12/25 입니다.";
		StringTokenizer tok1 = new StringTokenizer(str1);
		StringTokenizer tok2 = new StringTokenizer(str2, "/");

		System.out.println(tok1.countTokens() + " : " + str1);
		System.out.println(tok2.countTokens() + " : " + str2);
		while (tok1.hasMoreTokens()) {
			System.out.println(tok1.nextToken());
		}
		while (tok2.hasMoreElements()) {
			System.out.println(tok2.nextToken());
		}
	}

}
