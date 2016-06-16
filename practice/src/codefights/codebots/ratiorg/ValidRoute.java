package codefights.codebots.ratiorg;

public class ValidRoute {
	
	static int validRoute(int[] travelTimes, int[] readyTimes, int[] cancelTimes) {

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

			//totalWorkTime += travelTimes[i-1];
			totalWorkTime += travelTimes[i];
		}

		return totalWorkTime;
	}
	
	public static void main(String[] args) {
		int[] travelTimes = {500, 500};
		int[] readyTimes = {500, 500};
		int[] cancelTimes = {500, 500};

		validRoute(travelTimes, readyTimes, cancelTimes);
	}
}
