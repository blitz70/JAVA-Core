package codewars.kyu7;

public class Sum {

	// Beginner Series #3 Sum of Numbers
	public static int getSum(int a, int b) {
		int result = 0;
		if (a > b) {
			for (int i = a; i >= b; i--) {
				result = result + i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				result = result + i;
			}
		}
		return result;
	}

	public static void test(Object correct, Object value) {
		if (correct == value) {
			System.out.println("passed");
		} else
			System.out.println("failed");
	}

	public static void main(String[] args) {
		test(1, getSum(1, 0));
		test(3, getSum(1, 2));
		test(1, getSum(0, 1));
		test(1, getSum(1, 1));
		test(-1, getSum(-1, 0));
		test(2, getSum(-1, 2));
	}

}
