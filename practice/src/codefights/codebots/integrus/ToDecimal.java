package codefights.codebots.integrus;

public class ToDecimal {

	static int toDecimal(int k, String n) {

		int result = 0;
		int power = 1;
		for (int i = n.length() - 1; i >= 0; i--) {
			String s = ""+ n.charAt(i);
			int x = Integer.parseInt(s);
			result = (int) (result + x*Math.pow((double)k, (double)i));
			System.out.println(result);
		}

		return result;
	}

	public static void main(String[] args) {
		
		int answer = toDecimal(10, "87632");
		//System.out.println(answer);

	}

}
