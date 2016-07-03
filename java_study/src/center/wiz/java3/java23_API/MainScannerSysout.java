package center.wiz.java3.java23_API;

import java.util.Scanner;

public class MainScannerSysout {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("i = " + i);
		
		System.out.println("START");
		String str1 = scan.next();
		System.out.println("str1 = " + str1);
		String str2 = scan.nextLine();
		System.out.println("str2 = " + str2);	//위의 리턴(\n) 문자가 남아서 자동으로 입력되고 바로 끝남
		System.out.println("END");

		System.out.println("START");
		String str3 = scan.nextLine();
		System.out.println("str3 = " + str3);
		String str4 = scan.next();
		System.out.println("str4 = " + str4);
		System.out.println("END");
		
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.println("AAA");
		System.out.println("BBB");

	}
}