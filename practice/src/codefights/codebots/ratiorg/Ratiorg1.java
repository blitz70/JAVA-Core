package codefights.codebots.ratiorg;

public class Ratiorg1 {

	public static boolean sulkyBoy(boolean statement) {
	    return (!statement);	//
	}
	
	public int uberPool(int[] A, int[] B, int[] C, int[] X, int[] Y) {

		class Helper {
			int distance(int[] P, int[] Q) {
				return Math.abs(P[0] - Q[0]) + Math.abs(P[1] - Q[1]);	//
			}
		}
		Helper h = new Helper();

		int initialDist = h.distance(A, B);
		int travelledDist = h.distance(A, C);
		int[][] D = new int[][] { X, Y };
		int[] remainingDist = new int[2];
		for (int i = 0; i < 2; i++) {
			remainingDist[i] = h.distance(C, D[i]) + h.distance(D[i], B);
		}

		int best = 1;
		if (remainingDist[0] > remainingDist[1]) {
			best = 2;
		}

		if (travelledDist + remainingDist[best - 1] > 2 * initialDist) {
			best = -1;
		}

		return best;
	}
	
	public static int validRoute(int[] travelTimes, int[] readyTimes, int[] cancelTimes) {

		int earliestStartTime = 0;
		int latestStartTime = 24 * 60 * 60;
		int totalWorkTime = 0;
		for (int i = 0; i < readyTimes.length; i++) {
			if (earliestStartTime + totalWorkTime > cancelTimes[i]) {
				return -1;
			}
			latestStartTime = Math.min(latestStartTime, cancelTimes[i] - totalWorkTime);
			if (latestStartTime + totalWorkTime < readyTimes[i]) {
				totalWorkTime = readyTimes[i] - latestStartTime;
			}
			earliestStartTime = Math.max(earliestStartTime, readyTimes[i] - totalWorkTime);

			totalWorkTime += travelTimes[i];	//
		}
		return totalWorkTime;
	}
	
	public static void main(String[] args) {
		
		//validRoute
		int[] travelTimes = {500, 500};
		int[] readyTimes = {500, 500};
		int[] cancelTimes = {500, 500};
		validRoute(travelTimes, readyTimes, cancelTimes);

	}
}
