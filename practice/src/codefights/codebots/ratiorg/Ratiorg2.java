package codefights.codebots.ratiorg;

public class Ratiorg2 {

	//check if bracket expression is valid
	public static boolean regularBracketSequence1(String sequence) {
		int balance = 0;
		for (int i = 0; i < sequence.length(); i++) {
			if (sequence.charAt(i) == '(') {
				balance++;
			} else {
				balance--;
			}
			if (balance < 0) {	//was hard!
				return false;
			}
		}
		if (balance != 0) {
			return false;
		}
		return true;
	}

	//return product value of an array
	public static int arrayElementsProduct(int[] inputArray) {

		  int result =  1 ;	//

		  for (int i = 0; i < inputArray.length; i++) {	//
		    result *= inputArray[i];
		  }
		  return result;
	}

	// return highest counted number
	public static int arrayMode(int[] sequence) {
		// counts for each number
		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		// highest count
		int count_high = 0;
		// highest counted number
		int result = 0;
		for (int i = 0; i < sequence.length; i++) {
			// number to be counted
			int number = sequence[i];
			count[number - 1]++;
			if (count[number - 1] > count_high) {
				count_high = count[number - 1];
				result = number;
			}
		}
		return result;	//no logic for multiple answers
	}
	
	public static void main(String[] args) {
		
		//regularBracketSequence1
		//String sequence = "()()"; // T
		//String sequence = "((())"; // F
		//String sequence = "(())()()()"; // T
		String sequence = ")("; // F
		System.out.println(regularBracketSequence1(sequence));
		
		//arrayMode
		int[] sequence1 = { 1, 3, 3, 3, 1 };
		// int[] sequence1 = {1, 3, 2, 1};
		// int[] sequence1 = {1, 10, 10};
		System.out.println(arrayMode(sequence1));
		
	}
}
