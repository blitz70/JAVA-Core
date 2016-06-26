package codefights.codebots;

public class Test {

	public Test(Object correct, Object value) {
		if (correct.equals(value)) {
			System.out.println("passed");
		} else
			System.out.println("failed");
	}
	
	public static void main(String[] args) {

	}
}
