package codefights.codebots.integrus;

public class ToDecimal {

	static int toDecimal(int k, String n) {

		// 4327=(4x10^3)+(3x10^2)+(2x10^1)+(7x10^0) = digit * base ^ power
		int result = 0;
		int power = 1;
		for (int i = n.length() - 1; i >= 0; i--) {
			String s = ""+ n.charAt(i);
			int digit = Integer.parseInt(s);
			power = (n.length()) - 1- i;
			int base = k;
			int result_temp = (int) (digit * Math.pow(base, power));
			result += result_temp;
			//System.out.println(digit + " " + result_temp + " " + result);
		}

		return result;
	}

	public static void main(String[] args) {
		
		int answer = toDecimal(2, "1101");
		System.out.println(answer);

	}

}
