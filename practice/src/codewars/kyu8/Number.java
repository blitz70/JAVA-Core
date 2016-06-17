package codewars.kyu8;

public class Number {

	// Is it even?
	public static boolean isEven(double n) {
		if (n % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static void test(boolean correct, boolean value) {
		if (correct == value) {
			System.out.println("passed");
		} else
			System.out.println("failed");
	}

	public static void main(String[] args) {
		test(true, isEven(0));
		test(false, isEven(0.5));
		test(false, isEven(1));
		test(true, isEven(2));
		test(true, isEven(-4));
	}
}
