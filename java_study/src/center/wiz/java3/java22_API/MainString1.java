package center.wiz.java3.java22_API;

public class MainString1 {

	public static void main(String[] args) {
		
		String str1 = "abcdefg";
		String str2 = new String("HIJKLMN");
		String str3 = "opqrstu";
		String str4 = "abcdefg";
		String str5 = " abc def ghi ";
		
		
		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str1.concat(str2));		//abcdefgHIJKLMN
		System.out.println(str1.substring(3));		//defg
		System.out.println(str1.length());				//7
		System.out.println(str1.toUpperCase());	//ABCDEFG
		System.out.println(str2.toLowerCase());	//hijklmn
		System.out.println(str1.charAt(3));			//d
		System.out.println(str1.indexOf('c'));		//2
		System.out.println(str1.equals(str4));		//true
		System.out.println(str1.trim());				//"abc def ghi"
		System.out.println(str1.replace('a', 'Z'));	//Zbcdefg
		System.out.println(str1.replaceAll("abcd"," ZZZZZ"));		//ZZZZZefg

		System.out.println(str1);						//abcdefg

	}

}
