package codefights.codebots.integrus;

public class VerticesDegrees {

	static int[] verticesDegrees(boolean[][] matrix) {
		int[] result = {5, 5, 5};
		for (int i = 0; i < matrix.length; i++) {
			boolean [] element = matrix[i];
			if (element[0] == false && element[1] == false && element[2] == false) {			// 0 0 0
				result[i] = 0;
			} else if (element[0] == false && element[1] == false && element[2] == true) {	// 0 0 1
				result[i] = 0;
			} else if (element[0] == false && element[1] == true && element[2] == false) {	// 0 1 0
				result[i] = 0;
			} else if (element[0] == false && element[1] == true && element[2] == true) {	// 0 1 1
				result[i] = 2;
			} else if (element[0] == true && element[1] == false && element[2] == false) {	// 1 0 0
				result[i] = 0;
			} else if (element[0] == true && element[1] == false && element[2] == true) {	// 1 0 1
				result[i] = 0;
			} else if (element[0] == true && element[1] == true && element[2] == false) {	// 1 1 0
				result[i] = 2;
			} else if (element[0] == true && element[1] == true && element[2] == true) {	// 1 1 1 
				result[i] = 4;
			} else result[i] = 10;
			System.out.println(result[i]);
		};
		return result;
	}
		public static void main(String[] args) {
			boolean[][] matrix = {
					{false, true, true},
					{true, true, true},
					{true, true, false}
			};
			verticesDegrees(matrix);
	}
		
}
