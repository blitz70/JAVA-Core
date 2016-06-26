package codefights.codebots;

public class Test {

	public Test(Object correct, Object value) {
		if (correct.equals(value)) {
			System.out.println("passed");
		} else
			System.out.println("failed");
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{2,3,4,5}, 
		                  {1,8,7,6}, 
		                  {12,9,10,11}};
		/*
		int[][] matrix = {{5,4,3,2,1}};
		*/
		
		//find start position
		int x1 = 0, y1 = 0;
		for (int y = 0; y < matrix.length; y++) {
			for (int x = 0; x < matrix[y].length; x++) {
				if (matrix[y][x] == 1) {
					x1 = x;
					y1 = y;
				}
			}
		}
		//System.out.println(x1);
		//System.out.println(y1);

		//find end
		int num_end = matrix.length * matrix[0].length;
		//System.out.println(num_end);
		
		//find position of next number
		int count = 1;
		while(count < num_end) {
			
			if (x1!=0 && matrix[y1][x1-1] == count +1) { //left
				count++;
				x1 = x1-1;
				System.out.println(count);
			} else if (x1!=matrix[y1].length && matrix[y1][x1+1] == count +1) {	//right
				count++;
				x1 = x1+1;
				System.out.println(count);
			} else if (y1!=0 && matrix[y1-1][x1] == count +1) {	//up
				count++;
				y1 = y1-1;
				System.out.println(count);
			} else if (y1!=matrix.length && matrix[y1+1][x1] == count +1) {	//down
				count++;
				y1 = y1+1;
				System.out.println(count);
			} else break;
		}
		System.out.println(count == num_end);
	}
}
