package codefights.codebots.ratiorg;

public class UberPool {

	int uberPool(int[] A, int[] B, int[] C, int[] X, int[] Y) {

		class Helper {
			int distance(int[] P, int[] Q) {
				// return ...
				return Math.abs(P[0] - Q[0]) + Math.abs(P[1] - Q[1]);
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

	public static void main(String[] args) {

	}

}
