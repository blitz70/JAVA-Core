package codewars.kyu7;

public class Vowel2Index {
	
	public static String vowel2Index(String s) {
		// a e i o u, y?
		String answer = "";
		int i = 0;
		String _s = s.toLowerCase();
		while ( i < _s.length()) {
			if (_s.charAt(i) == 'a' || _s.charAt(i) == 'e' || _s.charAt(i) == 'i' || _s.charAt(i) == 'o' || _s.charAt(i) == 'u') {
				answer += i+1;
			} else {
			answer += s.charAt(i);
			}
			i++;
		}
		return answer;
	}
	public static void main(String[] args) {
		String s1 = "this is my string";
		String s2 = "Codewars is the best site in the world";
		String s3 = "Tomorrow is going to be raining";
		String s4 = "";
		System.out.println(vowel2Index(s1));
		System.out.println(vowel2Index(s2));
		System.out.println(vowel2Index(s3));
		System.out.println(vowel2Index(s4));
	}

}
