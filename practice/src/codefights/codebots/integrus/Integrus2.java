package codefights.codebots.integrus;

public class Integrus2 {

	boolean gasPrediction(double[] driveDistances, double currentGasLevel, double avgMileage) {

		double totalDistance = 0;
		for (int i = 0; i < driveDistances.length; i++) {
			totalDistance += driveDistances[i]; //
		}
		double gasConsumed = totalDistance / avgMileage;

		return currentGasLevel < gasConsumed / 12;
	}

	double perfectCity(double[] departure, double[] destination) {
		double result = 0;
		for (int i = 0; i < 2; i++) {
			if (departure[i] < destination[i]) {		//failed to solve
				double floorSum = departure[i] - Math.floor(departure[i]);
				floorSum += destination[i] - Math.floor(destination[i]);
				if (floorSum < 1) {
					result += floorSum;
					departure[i] = Math.floor(departure[i]);
					destination[i] = Math.floor(destination[i]);
				} else {
					result += 2 - floorSum;
					departure[i] = Math.ceil(departure[i]);
					destination[i] = Math.ceil(destination[i]);
				}
			} else {
				if (departure[i] > destination[i]) {
					double[] tmp = destination;
					destination = departure;
					departure = tmp;
				}
				result += Math.ceil(departure[i]) - departure[i];
				departure[i] = Math.ceil(departure[i]);
				result += destination[i] - Math.floor(destination[i]);
				destination[i] = Math.floor(destination[i]);
			}
			result += destination[i] - departure[i];
		}

		return result;
	}

	boolean findPath(int[][] matrix) {	//works?
		
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
			} else if (x1!=matrix[y1].length-1 && matrix[y1][x1+1] == count +1) {	//right
				count++;
				x1 = x1+1;
				System.out.println(count);
			} else if (y1!=0 && matrix[y1-1][x1] == count +1) {	//up
				count++;
				y1 = y1-1;
				System.out.println(count);
			} else if (y1!=matrix.length-1 && matrix[y1+1][x1] == count +1) {	//down
				count++;
				y1 = y1+1;
				System.out.println(count);
			} else break;
		}
		System.out.println(count == num_end);
		
		boolean answer = (count == num_end);
		return answer;
	}
	
	public static void main(String[] args) {

		/*perfectCity
		True departure[i] < destination[i], departure[i] != destination[i]
		double[] departure = {0.4, 1.0};	//1
		double[] destination = {0.9, 3.0};
		double[] departure = {0.0, 0.2};	//3
		double[] destination = {7.0, 0.5};
		double[] departure = {0.0, 0.4};	//5
		double[] destination = {1.0, 0.6};
		
		False departure[i] == destination[i]
		double[] departure = {2.4, 1.0};	//2
		double[] destination = {5.0, 7.3};
		double[] departure = {0.9, 6.0};	//4
		double[] destination = {1.1, 5.0};
		double[] departure = {0.4, 1.0};	//1
		double[] destination = {0.9, 3.0};
		System.out.println(bot.perfectCity(departure, destination));
		 */
		int[][] matrix = {{1,4,5}, 
				 {2,3,6}};
				
		/*
		int[][] matrix = {{2,3,4,5}, 
			                  {1,8,7,6}, 
			                  {12,9,10,11}};
		int[][] matrix = {{5,4,3,2,1}};
		*/

		Integrus2 bot = new Integrus2();
		bot.findPath(matrix);
	}
}
