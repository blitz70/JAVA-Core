package codewars.kyu7;

public class Factorial {

	// Factorial
	public static int factorial(int n) {
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException();
		} else if (n == 0) {
			return 1;
		} else {
			int result = 1;
			for (int i = n; i >= 1; i--) {
				result *= i;
				//System.out.println(result);
			}
			return result;
		}
	}

	public static void test(Object correct, Object value) {
		if (correct == value) {
			System.out.println("passed");
		} else
			System.out.println("failed");
	}

	public static void main(String[] args) {
		test(1, factorial(0));
		test(6, factorial(3));
		test(120, factorial(5));
	}

}
