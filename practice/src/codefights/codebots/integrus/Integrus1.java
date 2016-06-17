package codefights.codebots.integrus;

public class Integrus1 {

	public static boolean variableName(String name) {

		for (int i = 0; i < name.length(); i++) {
			if (!('a' <= name.charAt(i) && name.charAt(i) <= 'z' || 'A' <= name.charAt(i) && name.charAt(i) <= 'Z' ||
			// '1' <= name.charAt(i) && name.charAt(i) <= '9' ||
					'0' <= name.charAt(i) && name.charAt(i) <= '9' || name.charAt(i) == '_')) {
				return false;
			}
		}
		if ('0' <= name.charAt(0) && name.charAt(0) <= '9') {
			return false;
		}
		return true;
	}

	// 4327=(4x10^3)+(3x10^2)+(2x10^1)+(7x10^0) = digit * base ^ power
	public static int toDecimal(int k, String n) {
		int result = 0;
		int power = 1;
		for (int i = n.length() - 1; i >= 0; i--) {
			String s = "" + n.charAt(i);
			int digit = Integer.parseInt(s);
			power = (n.length()) - 1 - i;
			int base = k;
			int result_temp = (int) (digit * Math.pow(base, power));
			result += result_temp;
			// System.out.println(digit + " " + result_temp + " " + result);
		}
		return result;
	}

	public static int[] verticesDegrees(boolean[][] matrix) {
		int[] result = { 5, 5, 5 };
		for (int i = 0; i < matrix.length; i++) {
			boolean[] element = matrix[i];
			if (element[0] == false && element[1] == false && element[2] == false) { // 0
																						// 0
																						// 0
				result[i] = 0;
			} else if (element[0] == false && element[1] == false && element[2] == true) { // 0
																							// 0
																							// 1
				result[i] = 0;
			} else if (element[0] == false && element[1] == true && element[2] == false) { // 0
																							// 1
																							// 0
				result[i] = 0;
			} else if (element[0] == false && element[1] == true && element[2] == true) { // 0
																							// 1
																							// 1
				result[i] = 2;
			} else if (element[0] == true && element[1] == false && element[2] == false) { // 1
																							// 0
																							// 0
				result[i] = 0;
			} else if (element[0] == true && element[1] == false && element[2] == true) { // 1
																							// 0
																							// 1
				result[i] = 0;
			} else if (element[0] == true && element[1] == true && element[2] == false) { // 1
																							// 1
																							// 0
				result[i] = 2;
			} else if (element[0] == true && element[1] == true && element[2] == true) { // 1
																							// 1
																							// 1
				result[i] = 4;
			} else
				result[i] = 10;
			System.out.println(result[i]);
		}
		return result;
	}

	public static void main(String[] args) {

		// variableName
		String name = "variable0";
		System.out.println(variableName(name));

		// toDecimal
		int answer = toDecimal(2, "1101");
		System.out.println(answer);

		// verticesDegrees
		boolean[][] matrix = { { false, true, true }, { true, true, true }, { true, true, false } };
		verticesDegrees(matrix);

	}
}
